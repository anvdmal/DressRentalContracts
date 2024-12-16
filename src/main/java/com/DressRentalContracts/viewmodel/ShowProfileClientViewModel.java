package com.DressRentalContracts.viewmodel;

import java.math.BigDecimal;
import java.util.List;

public record ShowProfileClientViewModel(
        BaseViewModel base,
        String name,
        String email,
        BigDecimal rating,
        List<ShowRentalViewModel> rentalHistory
) {}
