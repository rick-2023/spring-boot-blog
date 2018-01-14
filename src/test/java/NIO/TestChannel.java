package NIO;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/**
 * Created by Administrator on 2017/5/29 0029.
 * <p>
 * 获取通道的方法
 * getChannel()
 * <p>
 * open()
 * newByteChannel()
 **/

public class TestChannel {
    //利用通道完成文件复制（非直接缓冲区）
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            fis = new FileInputStream("d:/1.jpg");
            fos = new FileOutputStream("d:/2.jpg");

            //获取通道
            inChannel = fis.getChannel();
            outChannel = fos.getChannel();

            //分配缓冲
            ByteBuffer buf = ByteBuffer.allocate(1024);
            //将通道写入缓冲
            while (inChannel.read(buf) != -1) {
                //将缓冲写出通道
                buf.flip();
                outChannel.write(buf);
                buf.clear();
            }
        } catch (Exception e) {

        } finally {
            try {
                if (inChannel != null)
                    inChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (outChannel != null)
                    outChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test2() {
        //利用直接缓冲区完成文件操作 内存映射文件
        try {
            FileChannel inChannel = FileChannel.open(Paths.get("d:/1.jpg"), StandardOpenOption.READ);
            FileChannel outChannel = FileChannel.open(Paths.get("d:/2.jpg"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);

            //内存映射文件
            MappedByteBuffer inByteBuffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
            MappedByteBuffer outByteBuffer = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

            byte[] des = new byte[inByteBuffer.limit()];
            inByteBuffer.get(des);
            outByteBuffer.put(des);

            inChannel.close();
            outChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    //通道之间的数据传输
    public void test3() {
        try {
            //直接缓冲区
            FileChannel inChannel = FileChannel.open(Paths.get("d:/1.jpg"), StandardOpenOption.READ);
            FileChannel outChannel = FileChannel.open(Paths.get("e:/2.jpg"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);

            inChannel.transferTo(0, inChannel.size(), outChannel);
            inChannel.close();
            outChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    //chaset
    public void test5() {
        SortedMap<String, Charset> map = Charset.availableCharsets();
        Set<Map.Entry<String, Charset>> set = map.entrySet();
        for (Map.Entry<String, Charset> entry : set) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    @Test
    //编码与解码
    public void test6() throws Exception {
        Charset cs1 = Charset.forName("GBK");
        //获取编码器
        CharsetEncoder ce = cs1.newEncoder();
        //获取编码器
        CharsetDecoder cd = cs1.newDecoder();

        CharBuffer cBuf = CharBuffer.allocate(1024);
        cBuf.put("中国");
        cBuf.flip();

        ByteBuffer bBuf = ce.encode(cBuf);

        for (int i=0;i<4;i++){
            System.out.println(bBuf.get());
        }

        bBuf.flip();
        CharBuffer cBuf1 = cd.decode(bBuf);
        System.out.println(cBuf1.toString());
    }
}

