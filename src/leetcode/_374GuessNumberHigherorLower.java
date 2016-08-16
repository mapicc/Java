package leetcode;

/**
 * Created by guanjun on 2016/8/16.
 */
public class _374GuessNumberHigherorLower {
    public int guessNumber(int n) {
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0)
                return mid;
            else if (guess(mid) == 1)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    private int guess(int mid) {
        return mid;
    }
}
