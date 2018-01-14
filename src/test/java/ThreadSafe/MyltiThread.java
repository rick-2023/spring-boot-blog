package ThreadSafe;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author 范正荣
 * @Date 2017/8/18 0018 上午 10:52.
 */
public class MyltiThread {
    public static void main(String[] args) {
        //获取线程管理的MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //不需要获取同步的monitor和Sychronizer信息，仅获取线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        for(ThreadInfo threadInfo:threadInfos){
            System.out.println("["+threadInfo.getThreadId()+"]"+threadInfo.getThreadName());
        }
    }
}
