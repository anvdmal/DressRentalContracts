package com.DressRentalContracts.viewmodel;

import java.util.UUID;

public record SuccessRentViewModel(
        BaseViewModel base,
        UUID newRentalId
) {}
