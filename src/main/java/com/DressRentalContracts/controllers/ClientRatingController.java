package com.DressRentalContracts.controllers;

import com.DressRentalContracts.form.AddClientRatingForm;
import com.DressRentalContracts.form.EditClientRatingForm;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/ratings")
public interface ClientRatingController extends BaseController {
    @GetMapping()
    String showRatingsPage(Model model);

    //    @GetMapping("/{clientId}/create-rating")
    @GetMapping("/{ratingId}/create")
    String showCreateRatingPage(
//            @PathVariable UUID clientId,
            @PathVariable UUID ratingId,
            Model model);

    //    @PostMapping("/{clientId}/create-rating")
    @PostMapping("/{ratingId}/create")
    String createRating(
//             @PathVariable UUID clientId,
            @PathVariable UUID ratingId,
            @Valid @ModelAttribute("form") AddClientRatingForm form,
            BindingResult bindingResult,
            Model model);

    @GetMapping("/{ratingId}/edit")
    String showEditRatingPage(
            @PathVariable UUID ratingId,
            Model model);

    @PostMapping("/{ratingId}/edit")
    String editRating(
            @PathVariable UUID ratingId,
            @Valid @ModelAttribute("form") EditClientRatingForm form,
            BindingResult bindingResult,
            Model model);
}
