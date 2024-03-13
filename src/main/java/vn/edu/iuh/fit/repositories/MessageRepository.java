package vn.edu.iuh.fit.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.entities.Message;

@Repository
public interface MessageRepository extends MongoRepository<Message, String> {
}
