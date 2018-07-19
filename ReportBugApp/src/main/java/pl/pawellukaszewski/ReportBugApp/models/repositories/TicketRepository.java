package pl.pawellukaszewski.ReportBugApp.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.pawellukaszewski.ReportBugApp.models.TicketModel;


@Repository
public interface TicketRepository extends CrudRepository<TicketModel, Integer> {


}
