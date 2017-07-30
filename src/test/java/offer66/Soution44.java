package offer66;

/**
 * @author 范正荣
 * @Date 2017/7/27 0027 下午 8:35.
 */
public class Soution44 {
    public String ReverseSentence(String str) {
        if (str == null || str.trim().equals(""))
            return str;

        String[] a = str.split(" ");
        StringBuffer o = new StringBuffer();
        int i;
        for (i=a.length;i>0;i--){
            o.append(a[i-1]);
            if (i>0)
                o.append(" ");
        }
        return o.toString();
    }
@org.junit.Test
    public void test(){
        String str = "I am student";
        System.out.println(ReverseSentence(str));
    }
}
