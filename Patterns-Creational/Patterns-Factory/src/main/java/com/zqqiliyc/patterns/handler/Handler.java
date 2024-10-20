package com.zqqiliyc.patterns.handler;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public interface Handler<T> {

    String getIdentity();

    void handleMessage(T obj);
}
