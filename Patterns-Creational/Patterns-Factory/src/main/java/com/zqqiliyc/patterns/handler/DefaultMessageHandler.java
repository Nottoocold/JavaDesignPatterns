package com.zqqiliyc.patterns.handler;

import com.zqqiliyc.patterns.handler.msg.Message;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public class DefaultMessageHandler implements Handler<Message<?>> {


    @Override
    public String getIdentity() {
        return this.getClass().getCanonicalName();
    }

    @Override
    public void handleMessage(Message<?> obj) {
        System.out.println("DefaultMessageHandler handle start");
        System.out.println(obj.getContent());
        System.out.println("DefaultMessageHandler handle end");
    }

}
