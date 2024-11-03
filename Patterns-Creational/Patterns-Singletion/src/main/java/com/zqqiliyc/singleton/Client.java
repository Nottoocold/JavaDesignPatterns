package com.zqqiliyc.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zqqiliyc
 * @since 2024-11-03
 */
public class Client {
    private static volatile String value;

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int t = i;
            threads.add(new Thread(() -> create("GOOD-" + t), "Thread-" + t));
        }
        threads.forEach(Thread::start);
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println("All done");
    }

    private static void create(String value) {
        Singleton instance = Singleton.getInstance(value);
        Client.value = instance.getValue();
        assert Client.value.equals(instance.getValue());
    }
}
