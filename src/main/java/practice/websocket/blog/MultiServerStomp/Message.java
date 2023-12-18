package practice.websocket.blog.MultiServerStomp;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Message {
    private String type;
    private String sender;
    private String channelId;
    private Object data;
//     {
//          "type": "",
//          "sender": "me",
//          "channelId": "eddy",
//          "data": "안녕하세요
//     }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void newConnect() {
        this.type = "new";
    }

    public void closeConnect() {
        this.type = "close";
    }
}
