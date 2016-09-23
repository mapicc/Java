package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/23.
 */
public class _42TrappingRainWater {
    public int trap(int[] height) {
        int max = 0;
        int leftMax = 0, rightMax = 0;
        int left = 0, right = height.length - 1;
        while(left <= right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if(leftMax < rightMax)
                max += leftMax - height[left++];
            else
                max += rightMax - height[right--];
        }
        return max;
    }
}
