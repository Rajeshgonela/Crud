package com.project.ResumeProject.service;

import com.project.ResumeProject.dto.InputDto.UserDto;
import com.project.ResumeProject.dto.responseDto.UserResponseDto;

public interface UserService {
    UserResponseDto registerUser(UserDto userDto);

    UserResponseDto getUserById(Long id);

    UserResponseDto updateUser(Long id, UserDto userDto);

    void deleteUser(Long id);
}
