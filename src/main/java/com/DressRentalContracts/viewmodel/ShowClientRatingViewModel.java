package com.DressRentalContracts.viewmodel;

import java.time.LocalDate;
import java.util.UUID;

public record ShowClientRatingViewModel(
        UUID ratingId,
        UUID clientId,
        String clientName,
        Integer rating,
        String comment,
        LocalDate date
) {}
