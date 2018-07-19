package pl.pawellukaszewski.ReportBugApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.pawellukaszewski.ReportBugApp.models.forms.LoginForm;


import javax.validation.Valid;


@Controller
public class LoginController {

    @PostMapping("/")
    public String log(@ModelAttribute("loginForm") @Valid LoginForm form, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "login";
        }
        if (form.getLogin().equals("admin") || form.getPassword().equals("admin")) {

            return "index";
        } else {

            model.addAttribute("infoLoginError", "Login Error");
            return "login";
        }

    }


    @GetMapping("/")
    public String log(Model model, LoginForm form) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }
}
