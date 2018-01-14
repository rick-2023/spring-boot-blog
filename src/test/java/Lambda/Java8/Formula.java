package Lambda.Java8;

/**
 * @author 范正荣
 * @Date 2017/10/3 0003 10:22.
 */
public interface Formula {
    double get(int a);

    default double getb(double b){
        return Math.sqrt(b);
    }
}
