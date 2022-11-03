package test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int m = Integer.valueOf(scanner.nextLine());
        final int n = Integer.valueOf(scanner.nextLine());
        Semaphore[] semaphore = new Semaphore[n + 1];
        for (int i = 1; i < semaphore.length; i++) {
            if (i == 1) {
                semaphore[i] = new Semaphore(1);
            } else {
                semaphore[i] = new Semaphore(0);
            }
        }
        ArrayList<Thread> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int finalI = i;
            list.add(new Thread(new Runnable() {
                @Override
                public void run() {
                    final int finalIndex = finalI;
                    for (int j = finalIndex; j <= m; j += n) {
                        try {
                            semaphore[finalIndex].acquire();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.printf("%s %d\n", Thread.currentThread().getName(), j);
                        if (finalIndex + 1 > n) {
                            semaphore[1].release();
                        } else {
                            semaphore[finalIndex + 1].release();
                        }
                    }
                }
            }));
        }
        for (Thread thread : list) {
            thread.start();
        }
    }
}
/*
100
3
 */