package Java特种兵;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
public class ThreadStackTest {
    public static void main(String[] args) {
        printStack(getStackByThread());
        printStack(getTraceByException());
    }
    private static void printStack(StackTraceElement[] stacks){
        for (StackTraceElement stack:
             stacks) {
            System.out.println(stack);
        }
        System.out.println("\n");
    }

    private static StackTraceElement[] getStackByThread(){
        return Thread.currentThread().getStackTrace();
    }

    private static StackTraceElement[] getTraceByException(){
        return new Exception().getStackTrace();
    }
}
