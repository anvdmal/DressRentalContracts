package com.DressRentalContracts.viewmodel;

import java.util.List;

public record ShowDressesViewModel(
        String imageUrl,
        String name,
        String description,
        Integer price,
        Integer deposit,
        List<String> sizes,
        boolean isDeleted
) {}