package thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicInteger {
    public static void main(String[] args) {

        /**
         * AtomicBoolean AtomicInteger AtomicLong
         */
        AtomicInteger atomicInteger = new AtomicInteger();

        final Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                atomicInteger.getAndIncrement();
            }
        });
        thread1.start();

        final Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                atomicInteger.incrementAndGet();
            }
        });
        thread.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(atomicInteger.get());
    }
}
