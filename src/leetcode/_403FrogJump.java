package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/24.
 */
public class _403FrogJump {
    public static void main(String[] args) {
        _403FrogJump t = new _403FrogJump();
        int[] nums = {0, 2};
        System.out.println(t.canCross(nums));
    }

    public boolean canCross(int[] stones) {
        if(stones.length == 1)
            return true;
        return dfs(stones, 0, 1);
    }

    public boolean dfs(int[] stones, int start, int k) {
        if(start == stones.length - 1)
            return true;
        if(start < stones.length - 1 && k > 0) {
            int index = isNumber(stones, start, k);
            System.out.println(k + " " + index);
            if(index != -1) {
                return dfs(stones, index, k - 1) || dfs(stones, index, k) || dfs(stones, index, k + 1);
            }
            return false;
        }
        return false;
    }

    public int isNumber(int[] stones, int start, int k) {
        int find = stones[start] + k;
        for(int i = start + 1; i < stones.length; i++) {
            if(stones[i] == find)
                return i;
        }
        return -1;
    }
}
