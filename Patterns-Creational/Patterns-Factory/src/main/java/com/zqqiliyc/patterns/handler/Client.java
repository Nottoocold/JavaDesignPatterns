package com.zqqiliyc.patterns.handler;

import com.zqqiliyc.patterns.handler.msg.ByteMessage;
import com.zqqiliyc.patterns.handler.msg.Message;
import com.zqqiliyc.patterns.handler.msg.TextMessage;

import java.nio.charset.StandardCharsets;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public class Client {

    public static void main(String[] args) {
        MessageHandlerFactory factory = new MessageHandlerFactory();
        TextMessage textMessage = new TextMessage("Hello World\ntext message.");
        ByteMessage byteMessage = new ByteMessage("Hello World\nbyte message.".getBytes(StandardCharsets.UTF_8));
        Handler<Message<?>> handler = factory.createHandler(textMessage);
        System.out.println("handler.getIdentity() = " + handler.getIdentity());
        handler.handleMessage(textMessage);

        handler = factory.createHandler(byteMessage);
        System.out.println("handler.getIdentity() = " + handler.getIdentity());
        handler.handleMessage(byteMessage);
    }
}
