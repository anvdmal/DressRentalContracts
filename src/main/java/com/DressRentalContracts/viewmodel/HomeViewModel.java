package com.DressRentalContracts.viewmodel;

import java.util.List;

public record HomeViewModel(
        BaseViewModel base,
        List<String> categories
) {}
