package offer66;

/**
 * @author 范正荣
 * @Date 2017/8/8 0008 上午 10:32.
 * 机器人的运动范围
 */
public class Solution62 {
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] visited = new boolean[rows][cols];
        return countingStep(threshold,rows,cols,0,0,visited);
    }

    public int countingStep(int threshold,int rows,int cols,int r,int c,boolean[][] visited){
        if (r<0 || r>=rows || c<0 || c>=cols || visited[r][c] || bitSum(r)+bitSum(c)>threshold)
            return 0;
        visited[r][c] = true;
        return  countingStep(threshold,rows,cols,r,c-1,visited)+
                countingStep(threshold,rows,cols,r,c+1,visited)+
                countingStep(threshold,rows,cols,r-1,c,visited)+
                countingStep(threshold,rows,cols,r+1,c,visited)+
                1;
    }

    public int bitSum(int t){
        int count = 0;
        while (t!=0){
            count += t%10;
            t/=10;
        }
        return count;
    }
}
