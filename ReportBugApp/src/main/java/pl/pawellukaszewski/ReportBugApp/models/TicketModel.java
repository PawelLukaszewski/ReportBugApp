package pl.pawellukaszewski.ReportBugApp.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.pawellukaszewski.ReportBugApp.models.forms.MainForm;


import javax.persistence.*;


@Data
@Entity
@Table(name = "ticket")
@NoArgsConstructor
public class TicketModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String author;
    private String message;


    public TicketModel(MainForm ticketForm) {


        author = ticketForm.getAuthor();
        message = ticketForm.getMessage();
    }
}
