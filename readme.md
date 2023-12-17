
## 공식 문서
https://docs.spring.io/spring-framework/reference/web/websocket.html

## 공식 실습 코드
https://spring.io/guides/gs/messaging-stomp-websocket/#scratch

### Postman을 이용한 응답 확인
- WebSocket localhost:8080/gs-guide-websocket
    ```
    Handshake Details
    Request URL: http://localhost:8080/gs-guide-websocket
    Request Method: GET
    Status Code: 101
    Request Headers
    Sec-WebSocket-Version: 13
    Sec-WebSocket-Key: qdOPYzG8tIGLtfFYGtZvAQ==
    Connection: Upgrade
    Upgrade: websocket
    Sec-WebSocket-Extensions: permessage-deflate; client_max_window_bits
    Host: localhost:8080
    Response Headers
    Upgrade: websocket
    Connection: upgrade
    Sec-WebSocket-Accept: 4uD0R383AJbce8HVJWsNjtZJgvM=
    Sec-WebSocket-Extensions: permessage-deflate;client_max_window_bits=15
    Date: Sun, 17 Dec 2023 19:59:39 GMT
  ```
#### ws vs wss
    ws는 webSocket 프로토콜
    wss는 HTTPS처럼 Secure WebSocket 프로토콜


### 블로그 예제
- https://brunch.co.kr/@springboot/695

### 추가로 공부할 소스
- https://brunch.co.kr/@springboot/639
