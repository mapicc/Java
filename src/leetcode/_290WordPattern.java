package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guanjun on 2016/8/23.
 */
public class _290WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if (strings.length != pattern.length())
            return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(strings[i]))
                    return false;
                map.put(pattern.charAt(i), strings[i]);
            }
            else {
                if (!map.get(pattern.charAt(i)).equals(strings[i]))
                    return false;
            }
        }
        return true;
    }
}
