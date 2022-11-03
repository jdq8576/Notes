package ionew.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author tim
 * @date 2022/9/16 10:39 上午
 */
public class BIOServer {
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        InetAddress inetAddress = InetAddress.getLocalHost();

        ServerSocket serverSocket = new ServerSocket(6666);
        while (true) {
            System.out.println("等待链接中");
            Socket socket = serverSocket.accept();
            System.out.println("连接到一个客户端");
            executorService.execute(() -> handle(socket));
        }
    }

    public static void handle(Socket socket) {
        byte[] bytes = new byte[1024];
        System.out.println("当前线程信息: " + Thread.currentThread().getName());
        try {
            InputStream inputStream = socket.getInputStream();
            int len = -1;
            while ((len = inputStream.read(bytes)) != -1) {
                System.out.println(Thread.currentThread().getName() + " : 发送信息为 :" + new String(bytes, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("关闭连接");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
