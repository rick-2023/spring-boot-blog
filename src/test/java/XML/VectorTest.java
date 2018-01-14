package XML;

import java.util.Vector;

/**
 * @author 范正荣
 * @Date 2017/9/4 0004 下午 3:04.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector  vec = new Vector();

        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);


        vec.set(0,100);
        vec.add(2, "300");
        System.out.println("vec:"+vec);

        System.out.println("vec.indexOf(100): "+vec.indexOf(100));
        System.out.println("lastindexOf: "+vec.lastIndexOf(100));
        System.out.println("vec 2 to 4:"+vec.subList(1, 4));
    }
}
