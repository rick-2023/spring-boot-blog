package XML;

/**
 * @author 范正荣
 * @Date 2017/9/6 0006 下午 4:08.
 */
public class Solution5 {
        public String ReverseSentence(String str) {
            String[] s = str.split(" ");
            StringBuffer sb = new StringBuffer();
            for(int i=s.length;i>0;i--){
                sb.append(s[i-1]);
                if(i>1)
                    sb.append(" ");
            }

            return sb.toString();
        }
    }
