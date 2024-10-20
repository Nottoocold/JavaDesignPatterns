package com.zqqiliyc.patterns.handler.msg;

import java.util.stream.Stream;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public class TextMessage implements Message<String> {
    private final String content;

    public TextMessage(String content) {
        this.content = content;
    }

    @Override
    public String getType() {
        return "text";
    }

    @Override
    public String getContent() {
        return content;
    }

    public Stream<String> lines() {
        if (getContent() == null || getContent().isEmpty()) {
            return Stream.empty();
        }
        return Stream.of(getContent().split("\n"));
    }
}
