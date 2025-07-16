package com.project.ResumeProject.service.serviceImpl;


import com.project.ResumeProject.dto.InputDto.UserDto;
import com.project.ResumeProject.dto.responseDto.UserResponseDto;
import com.project.ResumeProject.entity.User;
import com.project.ResumeProject.exception.AlreadyExists;
import com.project.ResumeProject.exception.NotFound;
import com.project.ResumeProject.mapper.UserMapper;
import com.project.ResumeProject.repository.UserRepository;
import com.project.ResumeProject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserResponseDto registerUser(UserDto userDto) {

        if (userRepository.findByEmail(userDto.getEmail()).isPresent()) {
            throw new AlreadyExists("User with this email already exists.");
        }

        User user = UserMapper.toEntity(userDto);

        User savedUser = userRepository.save(user);

        return UserMapper.toResponseDto(savedUser);
    }

    @Override
    public UserResponseDto getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFound("User not found with id: " + id));
        return UserMapper.toResponseDto(user);
    }

    @Override
    public UserResponseDto updateUser(Long id, UserDto userDto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFound("User not found with id: " + id));
        user.setUserName(userDto.getUserName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setUpdatedAt(LocalDateTime.now());

        User updatedUser = userRepository.save(user);
        return UserMapper.toResponseDto(updatedUser);
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new NotFound("User not found with id: " + id));
        userRepository.delete(user);
    }
}
