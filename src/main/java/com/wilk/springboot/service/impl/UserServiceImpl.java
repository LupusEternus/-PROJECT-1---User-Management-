package com.wilk.springboot.service.impl;

import com.wilk.springboot.dto.UserDto;
import com.wilk.springboot.entity.User;
import com.wilk.springboot.exception.EmailAlreadyExistException;
import com.wilk.springboot.exception.ResourceNotfoundException;
import com.wilk.springboot.mapper.UserMapper;
import com.wilk.springboot.repository.UserRepository;
import com.wilk.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {


    private UserRepository userRepository;


    @Override
    public UserDto createUser(UserDto userDto) {

        Optional<User> optionalUser = userRepository.findByEmail(userDto.getEmail());
        if (optionalUser.isPresent()) {
            throw new EmailAlreadyExistException("Email already exist for User");
        }

        User savedUser = userRepository.save(UserMapper.mapToUser(userDto));
        return (UserMapper.mapToUserDto(savedUser));
    }

    @Override
    public UserDto getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(
                () -> new ResourceNotfoundException("User", "id", id)
        );
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(UserMapper::mapToUserDto).toList();
    }

    @Override
    public UserDto updateUser(UserDto user) {

        User foundUser = userRepository.findById(user.getId()).orElseThrow(
                () -> new ResourceNotfoundException("User", "id", user.getId())
        );
        foundUser.setEmail(user.getEmail());
        foundUser.setFirstName(user.getFirstName());
        foundUser.setLastName(user.getLastName());
        userRepository.save(foundUser);
        return UserMapper.mapToUserDto(foundUser);
    }

    @Override
    public void deleteUser(Long id) {
        User foundUser = userRepository.findById(id).orElseThrow(
                () -> new ResourceNotfoundException("User", "id", id)
        );
        userRepository.deleteById(id);
    }
}
