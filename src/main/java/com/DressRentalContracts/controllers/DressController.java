package com.DressRentalContracts.controllers;

import com.DressRentalContracts.form.AddDressForm;
import com.DressRentalContracts.form.AddRentalForm;
import com.DressRentalContracts.form.EditDressForm;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
import java.util.UUID;

@RequestMapping("/dress")
public interface DressController extends BaseController {
    @GetMapping("/{categoryName}/category-dresses")
    String showDressCategoryPage(
            Principal principal,
            @PathVariable String categoryName,
            Model model);

    @GetMapping("/admin/{categoryName}")
    String showDressCategoryPageAdmin(
            Principal principal,
            @PathVariable String categoryName,
            Model model);

    @GetMapping("/shining-time")
    String showShiningTimePage(
            Principal principal,
            Model model);

    @GetMapping("/{dressName}/rent")
    String showAddRentalPage(
            @PathVariable String dressName,
            Model model);

    @PostMapping("/{dressName}/rent")
    String addRental(
            Principal principal,
            @PathVariable String dressName,
            @Valid @ModelAttribute("form") AddRentalForm form,
            BindingResult bindingResult,
            Model model);

    @GetMapping("/rent/{rentalId}")
    String showSuccessRentalPage(
            @PathVariable UUID rentalId,
            Model model);

    @GetMapping("/create-dress")
    String showCreateDressPage(Model model);

    @PostMapping("/create-dress")
    String createDress(
            @Valid @ModelAttribute("form") AddDressForm form,
            BindingResult bindingResult,
            Model model,
            RedirectAttributes redirectAttribute);


    @GetMapping("/{dressName}/edit")
    String showEditDressPage(
            @PathVariable String dressName,
            Model model);

    @PostMapping("/{dressName}/edit")
    String editDress(
            @PathVariable String dressName,
            @Valid @ModelAttribute("form") EditDressForm form,
            BindingResult bindingResult,
            Model model,
            RedirectAttributes redirectAttributes);

    @PostMapping("/{dressName}/delete")
    String deleteDress(
            @PathVariable String dressName,
            RedirectAttributes redirectAttribute);
}
