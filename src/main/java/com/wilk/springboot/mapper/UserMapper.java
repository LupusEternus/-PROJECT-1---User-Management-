package com.wilk.springboot.mapper;

import com.wilk.springboot.dto.UserDto;
import com.wilk.springboot.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        return  new UserDto(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
    }
    public static User mapToUser(UserDto userDto){
        return new User(userDto.getId(), userDto.getFirstName(), userDto.getLastName(), userDto.getEmail());
    }
}
