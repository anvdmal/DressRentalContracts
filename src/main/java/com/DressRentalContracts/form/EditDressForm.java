package com.DressRentalContracts.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record EditDressForm(
        @NotEmpty(message = "Категория обязательна")
        String category,
        @NotEmpty(message = "Наименование обязательно")
        @Length(min = 2, message = "Наименование должно содержать минимум два символа")
        String name,
        @NotNull(message = "Цена обязательна")
        @Min(value = 1, message = "Цена должна быть больше 0")
        @Max(value = 50000, message = "Цена не должна превышать 50000")
        Integer price,
        @NotEmpty(message = "Описание обязательно")
        @Length(min = 10, message = "Описание слишком короткое")
        String description
) {}
