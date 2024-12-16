package com.DressRentalContracts.viewmodel;

import java.util.List;

public record ShowRentalsViewModel(
        BaseViewModel base,
        List<ShowRentalViewModel> rentals
) {}
