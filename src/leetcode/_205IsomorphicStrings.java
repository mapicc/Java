package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guanjun on 2016/8/22.
 */
public class _205IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            }else {
                if (map.containsKey(s.charAt(i)) && t.charAt(i) != map.get(s.charAt(i)))
                    return false;
            }
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        int[] sAddr = new int[256];
        int[] tAddr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (sAddr[s.charAt(i)] != tAddr[t.charAt(i)])
                return false;
            else if (sAddr[s.charAt(i)] == 0) {
                sAddr[s.charAt(i)] = i + 1;
                tAddr[t.charAt(i)] = i + 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("ab", "aa"));
    }
}
