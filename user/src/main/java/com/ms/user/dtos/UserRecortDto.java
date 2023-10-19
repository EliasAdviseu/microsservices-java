package com.ms.user.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRecortDto(@NotBlank String name, @Email @NotBlank String email) {
    
}
