package pl.pawellukaszewski.ReportBugApp.models.forms;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;


public class MainForm {


    @Getter
    @Setter
    @NotBlank
    @Size(min = 3, max = 40)
    private String author;
    @Getter
    @Setter
    @NotBlank
    @Size(min = 3, max = 500)
    private String message;

}
