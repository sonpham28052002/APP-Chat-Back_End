package vn.edu.iuh.fit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import vn.edu.iuh.fit.entities.Message;
import vn.edu.iuh.fit.entities.User;
import vn.edu.iuh.fit.repositories.MessageRepository;

import java.util.List;
import java.util.UUID;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Message addMessage(@RequestBody Message message){
        message.setId(UUID.randomUUID().toString().split("-")[0]);
        return messageRepository.save(message);
    }

    public List<Message> finAll(){
        return messageRepository.findAll();
    }

    public Message findById(String id){
        return messageRepository.findById(id).get();
    }
}
