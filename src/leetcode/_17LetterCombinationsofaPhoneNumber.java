package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by guanjun on 2016/8/22.
 */
public class _17LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> list = new ArrayList<>();
        if (digits.length() == 0)
            return list;;
        helper(digits, 0, map, list, "");
        return list;
    }

    private void helper(String digits, int idx, Map<Character, String> map, List<String> list, String path) {
        if (digits.length() == path.length()) {
            list.add(path);
            return;
        }
        for (int i = idx; i < digits.length(); i++) {
            for (char c : map.get(digits.charAt(i)).toCharArray()) {
                helper(digits, i + 1, map, list, path + c);
            }
        }
    }

    public static void main(String[] args) {
        _17LetterCombinationsofaPhoneNumber t = new _17LetterCombinationsofaPhoneNumber();
        System.out.println(t.letterCombinations("22"));
    }
}
