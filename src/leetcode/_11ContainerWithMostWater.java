package leetcode;

public class _11ContainerWithMostWater {
	public int maxArea(int[] height){
		int max = 0, i = 0, j = height.length - 1;
		while(i < j){
			max = Math.max(max, (j - i) * (height[i] < height[j] ? height[i] : height[j]));
		}
		return max;
	}
}
