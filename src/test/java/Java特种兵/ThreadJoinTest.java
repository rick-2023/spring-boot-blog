package Java特种兵;

/**
 * Created by Administrator on 2017/6/4 0004.
 */
public class ThreadJoinTest{
    static class Computer extends Thread{
        private int start;
        private int end;
        private int result;
        private int[] array;

        public Computer(int[] array,int start,int end){
            this.array = array;
            this.start = start;
            this.end = end;
        }

        public void run(){
            for (int i=start;i<end;i++){
                result+=array[i];

            }
        }
    }
}
