package com.DressRentalContracts.viewmodel;

import java.util.UUID;

public record AddClientRatingViewModel(
        BaseViewModel base,
        UUID clientId,
        UUID rentalId
) {}
