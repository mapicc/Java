package newCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guanjun on 2016/9/10.
 */
public class minLength {
    public static int minLength(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() < str2.length())
            return 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str2.length(); i++) {
            map.put(str2.charAt(i), map.getOrDefault(str2.charAt(i), 0) + 1);
        }
        System.out.println(map);
        int left = 0, right = 0, match = str2.length(), min = Integer.MAX_VALUE;
        while (right < str1.length()) {
            if (map.containsKey(str1.charAt(right))) {
                map.put(str1.charAt(right), map.get(str1.charAt(right)) - 1);
                if (map.get(str1.charAt(right)) >= 0)
                    match--;
                if (match == 0) {
                    while (map.get(str1.charAt(left)) < 0)
                        map.put(str1.charAt(left), map.get(str1.charAt(left++)) + 1);
                    min = Math.min(min, right - left + 1);
                    match++;
                    map.put(str1.charAt(left), map.get(str1.charAt(left++)) + 1);
                }
                right++;
            }else {
                map.put(str1.charAt(right), -1);
                right++;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minLength("abcde", "ac"));
    }
}
