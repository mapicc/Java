package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/17.
 */
public class _397IntegerReplacement {

    public int integerReplacement(int n) {
        long N = n;
        int count = 0;
        while(N != 1) {
            if((N & 1) == 0)
                N >>= 1;
            else{
                long small = (N & (N - 1));
                long big = (N & (N + 1));
                if((small & (small - 1)) <= (big & (big - 1)))
                    N -= 1;
                else
                    N += 1;
            }
            count++;
        }
        return count;
    }
}
