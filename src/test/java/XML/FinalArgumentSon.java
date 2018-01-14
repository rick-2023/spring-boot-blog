package XML;

/**
 * @author 范正荣
 * @Date 2017/9/29 0029 9:52.
 */
public class FinalArgumentSon extends FinalArgument{
    public static int func (){
        try{
            return 1;
        }catch (Exception e){
            return 2;
        }finally{
            return 3;
        }
    }
   // public final void a(){}
    static final void aa(){}
    public static void main(String[] args) {
        System.out.println(func());
    }
}
