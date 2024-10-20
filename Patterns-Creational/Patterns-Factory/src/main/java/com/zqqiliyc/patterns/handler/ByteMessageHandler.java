package com.zqqiliyc.patterns.handler;

import com.zqqiliyc.patterns.handler.msg.ByteMessage;

import java.util.Arrays;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public class ByteMessageHandler implements Handler<ByteMessage> {

    @Override
    public String getIdentity() {
        return this.getClass().getCanonicalName();
    }

    @Override
    public void handleMessage(ByteMessage obj) {
        System.out.println("ByteMessageHandler handle start");
        System.out.println(Arrays.toString(obj.getContent()));
        System.out.println("ByteMessageHandler handle end");
    }
}
