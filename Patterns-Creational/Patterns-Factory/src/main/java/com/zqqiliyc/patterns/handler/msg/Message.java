package com.zqqiliyc.patterns.handler.msg;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public interface Message<T> {

    String getType();

    T getContent();
}
