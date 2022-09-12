package thread.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * https://www.jianshu.com/p/962bc7225ce8
 */
public class TestCountDownLatch {

    /**
     * 实现主线程等待其他线程的任务完成之后，才继续执行的代码。
     */
    static class TaskThread extends Thread {
        CountDownLatch latch;

        public TaskThread(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(getName() + " Task is Done");
                latch.countDown();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        int threadNum = 10;
        CountDownLatch latch = new CountDownLatch(threadNum);

        for (int i = 0; i < threadNum; i++) {
            TaskThread task = new TaskThread(latch);
            task.start();
        }

        System.out.println("Task Start!");

        latch.await();

        System.out.println("All Task is Done!");
    }
}
