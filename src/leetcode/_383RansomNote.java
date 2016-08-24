package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/24.
 */
public class _383RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            map[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map[ransomNote.charAt(i) - 'a']-- <= 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
    }
}
