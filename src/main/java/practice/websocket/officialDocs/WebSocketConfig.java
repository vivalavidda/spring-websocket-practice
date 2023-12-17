package practice.websocket.officialDocs;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker // 메시지 브로커가 지원하는 WebSocket 메시지 처리를 활성화
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    /**
     * configure the message broker
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // enable a simple memory-based message broker
        // to carry the greeting messages back to the client on destinations prefixed with /topic
        config.enableSimpleBroker("/topic");

        //designates the /app prefix for messages that are bound for methods annotated with @MessageMapping.
        // This prefix will be used to define all the message mappings.
        config.setApplicationDestinationPrefixes("/app");
    }

    /**
     * 웹소켓 연결을 위한 엔드포인트 등록
     * */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/gs-guide-websocket");
    }
}
