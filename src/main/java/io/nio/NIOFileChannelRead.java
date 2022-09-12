package io.nio;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileChannelRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("hello.txt");
        FileChannel channel = fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(100);
        channel.read(byteBuffer);
        System.out.println(new String(byteBuffer.array(), 0, byteBuffer.limit())); //Hello,Java菜鸟程序员
        channel.close();
        fileInputStream.close();
    }
}