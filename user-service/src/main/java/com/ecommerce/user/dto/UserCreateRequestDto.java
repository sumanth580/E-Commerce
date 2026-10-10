package com.ecommerce.user.dto;


import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequestDto {
    @NotBlank(message = "Name Required")
    private String name;
    @Email
    @NotBlank(message = "Valid Email Required")
    private String email;
    @NotBlank(message = "password is required")
    @Size(min = 6, message = "password must be 6 characters")
    private String password;
    private String phone;
}
