package com.zqqiliyc.singleton;

/**
 * @author zqqiliyc
 * @since 2024-11-03
 */
public class SingleFactory<T> {

    public static <T> T getInstance(Class<T> clazz) {
        // 1.look for 无参构造
        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
