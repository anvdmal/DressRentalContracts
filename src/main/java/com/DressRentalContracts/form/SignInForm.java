package com.DressRentalContracts.form;

import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

public record SignInForm(
        @NotEmpty(message = "Email обязателен")
        String email,
        @NotEmpty(message = "Пароль обязателен")
        @Length(min = 8, message = "Пароль должен состоять минимум из восьми символов")
        String password
) {}