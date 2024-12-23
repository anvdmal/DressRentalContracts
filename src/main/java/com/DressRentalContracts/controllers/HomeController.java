package com.DressRentalContracts.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@RequestMapping("/home")
public interface HomeController extends BaseController {
    @GetMapping
    String showHomePage(Model model);
}


