package com.wilk.springboot.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    @NotEmpty(message = "User firstName should not be null ir empty")
    private String firstName;
    @NotEmpty(message = "User lastname should not be null ir empty")
    private String lastName;
    @NotEmpty(message = "Email should not be ")
    @Email(message = "Email address not valid")
    private String email;

}
