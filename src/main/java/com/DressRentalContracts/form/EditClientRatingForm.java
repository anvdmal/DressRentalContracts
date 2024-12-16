package com.DressRentalContracts.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

public record EditClientRatingForm(
        UUID clientId,
        @NotNull(message = "Рейтинг обязателен")
        @Min(value = 1)
        @Max(value = 5)
        Integer rating,
        @NotEmpty(message = "Комментарий обязателен")
        @Length(min = 25, message = "Слишком короткий комментарий")
        String comment
) {}
