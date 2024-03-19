package com.app.controller.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @NotNull(message = "name can't be null")
    private String name;

    @NotNull(message = "lastName can't be null")
    private String lastName;

    @Email
    @NotBlank
    @NotNull(message = "email can't be null")
    private String email;

    @NotNull(message = "phone can't be null")
    private Long phone;

    @NotNull(message = "age can't be null")
    private byte age;

    @Digits(integer = 1, fraction = 2, message = "The number received is invalid")
    @NotNull(message = "height can't be null")
    private double height;

    @NotNull(message = "married can't be null")
    private boolean married;

    @Past(message = "The date must be before the current date")
    private LocalDate dateOfBirth;

    @Valid
    private DepartmentDTO departmentDTO;
}
