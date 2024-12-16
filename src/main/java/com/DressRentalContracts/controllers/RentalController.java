package com.DressRentalContracts.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/rentals")
public interface RentalController extends BaseController {
    @GetMapping("/not-confirmed")
    String showNotConfirmedRentalsPage(Model model);

    @PostMapping("/{rentalId}")
    String confirmRental(@PathVariable UUID rentalId);

    @PostMapping("/not-confirmed/{rentalId}/cancel")
    String cancelRental(@PathVariable UUID rentalId);

    @GetMapping("/active")
    String showActiveRentalsPage(Model model);

    @PostMapping("/{rentalId}")
    String completeRental(@PathVariable UUID rentalId);

    @GetMapping("/completed")
    String showCompletedRentalsPage(Model model);
}