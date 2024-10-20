package com.zqqiliyc.patterns.handler.msg;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public class ByteMessage implements Message<byte[]> {
    private final byte[] content;

    public ByteMessage(byte[] content) {
        this.content = content;
    }

    @Override
    public String getType() {
        return "byte";
    }

    @Override
    public byte[] getContent() {
        return content;
    }
}
