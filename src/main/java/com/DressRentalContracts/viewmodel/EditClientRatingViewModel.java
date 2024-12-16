package com.DressRentalContracts.viewmodel;

import java.util.UUID;

public record EditClientRatingViewModel(
        BaseViewModel base,
        UUID clientId
) {}
