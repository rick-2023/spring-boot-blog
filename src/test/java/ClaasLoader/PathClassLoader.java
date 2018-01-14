package ClaasLoader;

import java.io.*;

/**
 * @author 范正荣
 * @Date 2017/8/1 0001 下午 4:41.
 */
public class PathClassLoader extends ClassLoader {
    private String classpath;

    public PathClassLoader(String classpath) {
        this.classpath = classpath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if ("".startsWith(name)) {
            byte[] classData = getData(name);
            if (classData == null) {
                throw new ClassNotFoundException();
            } else {
                return defineClass(name, classData, 0, classData.length);
            }
        } else {
            return super.findClass(name);
        }
    }

    private byte[] getData(String className) {
        String path = classpath + File.separatorChar + className.replace('.', File.separatorChar) + ".class";

        try {
            InputStream is = new FileInputStream(path);
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            byte[] buffer = new byte[2048];
            int num = 0;
            while ((num = is.read()) != -1) {
                stream.write(buffer, 0, num);
            }
            return stream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
