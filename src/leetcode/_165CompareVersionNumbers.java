package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/23.
 */
public class _165CompareVersionNumbers {
    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int min = Math.min(v1.length, v2.length);
        int ret = 0;
        for (int i = 0; i < min; i++) {
            int v1Int = Integer.valueOf(v1[i]);
            int v2Int = Integer.valueOf(v2[i]);
            ret = (v1Int < v2Int) ? -1 : ((v1Int > v2Int) ? 1 : 0);
            if (ret != 0)
                return ret;
        }
        if (ret == 0) {
            if (v1.length > v2.length) {
                for (int i = min; i < v1.length; i++) {
                    if (Integer.valueOf(v1[i]) != 0) {
                        ret = 1;
                        break;
                    }
                }
            }
            else if (v1.length < v2.length)
                for (int i = min; i < v2.length; i++) {
                    if (Integer.valueOf(v2[i]) != 0) {
                        ret = -1;
                        break;
                    }
                }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.0", "1"));
    }
}
