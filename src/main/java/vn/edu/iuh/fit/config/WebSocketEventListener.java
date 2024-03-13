package vn.edu.iuh.fit.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;
import vn.edu.iuh.fit.entities.Message;
import vn.edu.iuh.fit.entities.User;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class WebSocketEventListener {
    private final SimpMessageSendingOperations sendingOperations;
    @EventListener
    public void handleDisconnect(SessionDisconnectEvent event){
        StompHeaderAccessor accessor = StompHeaderAccessor.wrap(event.getMessage());
        Object obj = accessor.getSessionAttributes().get("username");
        if(obj != null){
            String user = (String) obj;
            Message message = new Message("1",LocalDateTime.now(), user, user, "", false);
            sendingOperations.convertAndSend("/topic/public", message );

        }
    }
}
