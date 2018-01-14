package Lambda;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 范正荣
 * @Date 2017/8/26 0026 下午 4:41.
 */
public class Demo {
    private Set<String> NON_WORDS = new HashSet<String>(){{
        add("the");add("aaa");
    }};

    private List<String> regexToList(String words,String regex){
        List wordList = new ArrayList();
        Matcher m = Pattern.compile(regex).matcher(words);
        while (m.find())
            wordList.add(m.group());
        return wordList;
    }

    public Map wordFeq(String words){
        TreeMap<String,Integer> wordMap = new TreeMap<>();
        regexToList(words,"\\w+").stream()
                .map(w->w.toLowerCase())
                .filter(w -> !NON_WORDS.contains(w))
                .forEach(w->wordMap.put(w,wordMap.getOrDefault(w,0)+1));
        return wordMap;
    }
}
