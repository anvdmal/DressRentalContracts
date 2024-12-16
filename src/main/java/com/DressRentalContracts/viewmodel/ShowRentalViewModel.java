package com.DressRentalContracts.viewmodel;

import java.time.LocalDate;
import java.util.UUID;

public record ShowRentalViewModel(
        UUID rentalId,
        UUID clientId,
        String dressName,
        String dressSize,
        LocalDate rentalDate,
        LocalDate returnDate,
        Integer deposit,
        Integer finalPrice,
        String status,
        boolean hasRating
) {}
