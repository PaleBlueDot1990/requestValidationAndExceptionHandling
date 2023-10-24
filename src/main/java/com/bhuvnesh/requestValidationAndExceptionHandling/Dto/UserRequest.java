package com.bhuvnesh.requestValidationAndExceptionHandling.Dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest
{
    private int userID;
    @NotBlank(message = "User Name cannot be empty!")
    private String name;
    @Email(message = "Invalid email address!")
    private String email;
    @Pattern(regexp = "\\d{10}$", message= "Invalid phone number!")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;
}
