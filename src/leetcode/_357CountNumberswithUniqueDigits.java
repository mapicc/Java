package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/13.
 */
public class _357CountNumberswithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        if(n >= 11)
            return 0;
        if(n == 0)
            return 1;
        if(n == 1)
            return 10;
        int[] dp = new int[n + 1];
        dp[1] = 10;
        dp[2] = 81;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] * (11 - i);
        }
        for(int i = 1; i <= n; i++) {
            dp[i] = dp[i] + dp[i - 1];
        }
        return dp[n];
    }
}
