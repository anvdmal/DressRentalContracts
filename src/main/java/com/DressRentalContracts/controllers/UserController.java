package com.DressRentalContracts.controllers;

import jakarta.validation.Valid;
import com.DressRentalContracts.form.SignInForm;
import com.DressRentalContracts.form.SignUpForm;
import com.DressRentalContracts.form.EditUserProfileForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;
import java.util.UUID;

@RequestMapping("/user")
public interface UserController extends BaseController {
    @GetMapping("/login")
    String showLoginPage(Model model);

    @PostMapping("/login-error")
    String onFailedLogin(
            String email,
            RedirectAttributes redirectAttributes);

    @GetMapping("/register")
    String showRegisterPage(Model model);

    @PostMapping("/register")
    String registerUser(
            @Valid @ModelAttribute("form") SignUpForm form,
            BindingResult bindingResult,
            Model model);

    @GetMapping("/profile")
    String showUserProfile(
            Principal principal,
            Model model);

    @GetMapping("/profile/edit")
    String showEditProfilePage(
            Principal principal,
            Model model);

    @PostMapping("/profile/edit")
    String editProfile(
            Principal principal,
            @Valid @ModelAttribute("form") EditUserProfileForm form,
            BindingResult bindingResult,
            Model model);
}



