package com.zqqiliyc.patterns.handler;

import com.zqqiliyc.patterns.handler.msg.TextMessage;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public class TextMessageHandler implements Handler<TextMessage> {


    @Override
    public String getIdentity() {
        return this.getClass().getCanonicalName();
    }

    @Override
    public void handleMessage(TextMessage obj) {
        System.out.println("TextMessageHandler handle start");
        obj.lines().forEach(System.out::println);
        System.out.println("TextMessageHandler handle end");
    }
}
