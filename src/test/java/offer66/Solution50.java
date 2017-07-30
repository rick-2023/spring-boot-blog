package offer66;

/**
 * @author 范正荣
 * @Date 2017/7/30 0030 上午 10:41.
 * 正则表达式匹配
 */
public class Solution50 {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        int strIndex = 0;
        int patternIndex = 0;
        return matchCore(str, strIndex, pattern, patternIndex);
    }

    private boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if (str.length == strIndex && pattern.length == patternIndex) {
            return true;
        }
        if (str.length != strIndex && pattern.length == patternIndex) {
            return false;
        }

        //pattern中第2个是*，且第一个匹配
        if (pattern[patternIndex+1]=='*' && patternIndex+1<pattern.length){
            if ((strIndex!=str.length && str[strIndex]==pattern[patternIndex]) || (pattern[patternIndex]=='.' && strIndex!=str.length)){
                return matchCore(str,strIndex,pattern,patternIndex+2) ||
                        matchCore(str,strIndex+1,pattern,patternIndex+2) ||
                        matchCore(str,strIndex+1,pattern,patternIndex);
            }else {
                return matchCore(str,strIndex,pattern,patternIndex+2);
            }
        }
        if ((str.length!=strIndex && pattern[patternIndex]==str[strIndex]) || (pattern[patternIndex]=='.' && strIndex!=str.length)){
            return matchCore(str,strIndex+1,pattern,patternIndex+1);
        }
        return false;
    }
}
