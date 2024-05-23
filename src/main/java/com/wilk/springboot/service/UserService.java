package com.wilk.springboot.service;

import com.wilk.springboot.dto.UserDto;

import java.util.List;


public interface UserService {

    UserDto createUser(UserDto user);

    UserDto getUserById(Long id);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long id);

}
