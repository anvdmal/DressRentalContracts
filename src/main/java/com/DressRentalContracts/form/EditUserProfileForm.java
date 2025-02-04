package com.DressRentalContracts.form;

import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

public record EditUserProfileForm(
        @NotEmpty(message = "Имя обязательно")
        @Length(min = 2, message = "Имя должно содержать минимум два символа")
        String name,
        @NotEmpty(message = "Пароль обязателен")
        @Length(min = 8, message = "Пароль должен состоять минимум из восьми символов")
        String password,
        @NotEmpty(message = "Подтверждения пароля обязательно")
        String confirmPassword
) {}
