package XML;

/**
 * @author 范正荣
 * @Date 2017/9/29 0029 9:40.
 */
class Poppet{
    private  int i;
    Poppet(int i){
        i=i;
    }
}
public class BlankFianl {
    private final int i = 0;
    private final int j;//Blank final
    private final Poppet p;

    public BlankFianl(){
        j=1;
        p = new Poppet(1);
    }

    public BlankFianl(int x){
        j = x;
        p =new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFianl();
        new BlankFianl(47);
    }
}
