package DesignPattern.Decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author 范正荣
 * @Date 2017/7/22 0022 下午 9:37.
 */
public class Test {

    @org.junit.Test
    public void test() {
        int c;
        InputStream in;
        try {
             in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:/test.txt")));
            while ((c = in.read())>=0){
                System.out.print((char) c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
