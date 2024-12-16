package com.DressRentalContracts.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record AddRentalForm(
        @NotEmpty(message = "Размер обязателен")
        String dressSize,
        @NotNull(message = "Дата аренды обязательна")
        LocalDate rentalDate,
        @NotNull(message = "Дата возврата обязательна")
        LocalDate returnDate
) {}
