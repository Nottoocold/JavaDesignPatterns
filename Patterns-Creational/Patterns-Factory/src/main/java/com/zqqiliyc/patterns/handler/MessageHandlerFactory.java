package com.zqqiliyc.patterns.handler;

import com.zqqiliyc.patterns.handler.msg.Message;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public class MessageHandlerFactory {

    @SuppressWarnings("unchecked")
    public <T extends Message<?>> Handler<T> createHandler(Message<?> message) {
        if ("text".equals(message.getType())) {
            return (Handler<T>) new TextMessageHandler();
        }
        if ("byte".equals(message.getType())) {
            return (Handler<T>) new ByteMessageHandler();
        }
        return (Handler<T>) new DefaultMessageHandler();
    }

}
