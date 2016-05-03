package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1TwoSum {
	
	public static int isFind(int nums[],int i,int val){
		int j;
		for(j = i + 1;j < nums.length;j++){
			if(nums[j] == val)
				return j;
		}
		return -1;
	}
	
	//最笨的方法，时间复杂度O(n^2)
	public static int[] twoSum(int[] nums,int target){
		if(nums == null || nums.length < 2)
			return null;
		int ret[] = new int[2];
		for(int i = 0;i < nums.length;i++){
			int val = target - nums[i];
			int j = isFind(nums,i,val);
			if(j != -1){
				ret[0] = i;
				ret[1] = j;
				return ret;
			}
		}
		return null;
	}
	
	//第二种方法，先排序在查找
	public static int[] twoSum_2(int[] nums,int target){
		if(nums == null || nums.length < 2)
			return null;
		int tmp[] = Arrays.copyOf(nums, nums.length);
		Arrays.sort(tmp);
		int i = 0;
		int j = tmp.length;
		while(i < j){
			while(tmp[i]+tmp[--j]>target);
			if(tmp[i]+tmp[j]==target)
				break;
			while(tmp[++i]+tmp[j]<target);
			if(tmp[i]+tmp[j]==target)
				break;
		}
		int ret[] = new int[2];
		int index = 0;
		int a = tmp[i];
		int b = tmp[j];
		for(i =0 ;i<nums.length;i++){
			if(nums[i] == a || nums[i] == b)
				ret[index++] = i;
		}
		return ret;
	}
	
	//第三种方法，利用hashmap
	public static int[] twoSum_3(int[] nums,int target){
		if(nums == null || nums.length < 2)
			return null;
		Map<Integer,Integer> map = new HashMap<>();
		int ret[] = new int[2];
		for(int i=0;i<nums.length;i++){
			if(!map.containsKey(target - nums[i]))
				map.put(nums[i], i);
			else{
				ret[0] = map.get(target - nums[i]);
				ret[1] = i;
				break;
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,2,4};
		int ret[] = twoSum_3(a, 6);
		System.out.println(" "+ret[0]+ret[1]);
	}

}
