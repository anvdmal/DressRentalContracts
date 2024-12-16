package com.DressRentalContracts.viewmodel;

import java.util.List;

public record ShowClientRatingAllViewModel(
        BaseViewModel base,
        List<ShowClientRatingViewModel> ratings
) {}
