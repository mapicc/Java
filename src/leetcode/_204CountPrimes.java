package leetcode;

/**
 * Created by zhaoguanjun on 2016/8/23.
 */
public class _204CountPrimes {
    public static int countPrimes(int n) {
        if (n == 1)
            return 0;
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n - 1); i++) {
            if ((n - 1) % i == 0)
                count++;
        }
        if (count == 0)
            return 1 + countPrimes(n - 1);
        else
            return countPrimes(n - 1);
    }

    public static int countPrimes2(int n) {
        int ret = 0;
        boolean[] count = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (count[i] == false){
                ret++;
                for (int j = 2; i * j < n; j++) {
                    count[i * j] = true;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes2(12));
    }
}
