package ThreadSafe;

import java.io.*;

/**
 * @author 范正荣
 * @Date 2017/8/19 0019 上午 8:49.
 */
public class Piped {
    public static void main(String[] args) throws IOException {
        PipedReader in = new PipedReader();
        PipedWriter out = new PipedWriter();
        out.connect(in);
        Thread printThread = new Thread(new Print(in),"PrintThread");
        printThread.start();
       // printThread.join();

        int receive = 0;
        try {
            while ((receive = System.in.read()) != -1) {
                out.write(receive);
            }
        } finally {
            out.close();
        }
    }
    static class Print implements Runnable{
        private PipedReader in;

        public Print(PipedReader in) {
            this.in = in;
        }

        @Override
        public void run() {
            int receive = 0;
            try {
                while ((receive = in.read())!= -1){
                    System.out.print((char)receive);
                }
            } catch (IOException e) {
            }
        }
    }
}
