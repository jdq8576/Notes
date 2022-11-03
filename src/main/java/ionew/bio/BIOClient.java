package ionew.bio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author tim
 * @date 2022/9/16 10:46 上午
 */
public class BIOClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 6666);
            OutputStream os = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write("测试客户端和服务器通信，服务器接收到消息返回到客户端\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
