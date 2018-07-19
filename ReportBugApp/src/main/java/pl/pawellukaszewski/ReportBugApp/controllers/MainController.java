package pl.pawellukaszewski.ReportBugApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.pawellukaszewski.ReportBugApp.models.TicketModel;
import pl.pawellukaszewski.ReportBugApp.models.forms.TicketForm;
import pl.pawellukaszewski.ReportBugApp.models.repositories.TicketRepository;

import javax.validation.Valid;


@Controller
public class MainController {
    @Autowired
    TicketRepository ticketRepository;


    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("ticketForm", new TicketForm());
        return "index";
    }

    @PostMapping("/")
    public String index(@ModelAttribute("ticketForm")@Valid TicketForm form, BindingResult result, Model model) {
        if (result.hasErrors()){
            return "index";
        }
        ticketRepository.save((new TicketModel(form)));
        return "index";
    }
}