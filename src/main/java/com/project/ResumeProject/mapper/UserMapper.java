package com.project.ResumeProject.mapper;

import com.project.ResumeProject.dto.InputDto.UserDto;
import com.project.ResumeProject.dto.responseDto.UserResponseDto;
import com.project.ResumeProject.entity.User;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserMapper {

    public static UserResponseDto toResponseDto(User user) {
        if (user == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setUserName(user.getUserName());
        responseDto.setEmail(user.getEmail());
        responseDto.setCreatedAt(user.getCreatedAt().format(formatter));
        responseDto.setUpdatedAt(user.getUpdatedAt().format(formatter));
        return responseDto;
    }

    public static User toEntity(UserDto inputDto) {
        if (inputDto == null) {
            return null;
        }
        User user = new User();
        user.setUserName(inputDto.getUserName());
        user.setEmail(inputDto.getEmail());
        user.setPassword(inputDto.getPassword());
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        return user;
    }
}
