package repository;

import model.SubEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SubEventRepository extends MongoRepository<SubEvent, String> {

    List<SubEvent> findByEventID(String eventID);

}
