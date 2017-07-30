package offer66;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 范正荣
 * @Date 2017/7/30 0030 下午 2:14.
 * 字符流中第一个不重复的字符
 */
public class Solution51 {
    HashMap<Character,Integer> map = new HashMap<>();
    ArrayList<Character> list = new ArrayList<>();
    public void Insert(char ch)
    {
        if (map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else {
            map.put(ch, 1);
        }
        list.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        char c = '#';
        for (char key : list) {
            if (map.get(key) == 1) {
                c = key;
                break;
            }
        }
        return c;
    }
}
