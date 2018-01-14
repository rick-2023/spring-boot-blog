package ClaasLoader;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 范正荣
 * @Date 2017/8/15 0015 下午 3:38.
 */
public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {

                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".lcass";

                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name,b,0,b.length);

                } catch (IOException e) {
                    e.printStackTrace();
                    throw new ClassNotFoundException(name);
                }
            }
        };

        Object obj = classLoader.loadClass("");

    }
}
