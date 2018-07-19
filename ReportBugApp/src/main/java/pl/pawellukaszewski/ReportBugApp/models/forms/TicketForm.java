package pl.pawellukaszewski.ReportBugApp.models.forms;


import lombok.Getter;
import lombok.Setter;

public class TicketForm {

    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String author;
    @Getter
    @Setter
    private String message;


}
