package NIO;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * Created by Administrator on 2017/5/29 0029.
 */
public class TestBuffer {
    @Test
    public void test() {
        String str = "abcde";
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        System.out.println("------------allocate后-------------");
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());

        byteBuffer.put(str.getBytes());
        System.out.println("------------put后-------------");
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());

        byteBuffer.flip();
        System.out.println("------------flip后-------------");
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());

        byte[] bytes = new byte[byteBuffer.limit()];
        byteBuffer.get(bytes);
        System.out.println("------------get后-------------");
        System.out.println(new String(bytes, 0, bytes.length));
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());

        //rewind 可重复读


        //clear 清空huanc缓冲区，数据依然存在，处于被遗忘状态

    }


@Test
public void test2(){
    ByteBuffer buf = ByteBuffer.allocateDirect(1024);
    System.out.println(buf.isDirect());
}}