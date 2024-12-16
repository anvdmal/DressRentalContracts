package com.DressRentalContracts.viewmodel;

import java.util.List;

public record ShowCategoryDressesViewModel(
        BaseViewModel base,
        List<ShowDressesViewModel> categoryDresses
) {}
