package charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author tim
 * @date 2022/11/3 22:03
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1、编码
        String data = "a我b";
        final byte[] bytes = data.getBytes();// 默认是按照平台字符集(utf-8)编码的
        System.out.println(Arrays.toString(bytes));

        final byte[] gbks = data.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));

        // 2、解码
        final String s1 = new String(bytes);
        System.out.println(s1);

        final String s2 = new String(gbks, "GBK");
        System.out.println(s2);
    }
}
