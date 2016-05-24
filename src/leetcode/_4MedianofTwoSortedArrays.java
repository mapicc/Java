package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _4MedianofTwoSortedArrays {
	public static double findMedianSortedArrays(int nums1[], int nums2[]){
		if(nums1.length == 0){
			if(nums2.length % 2 == 0)
				return (nums2[(nums2.length - 1) / 2] + nums2[(nums2.length - 1) / 2 + 1]) / 2.0;
			else
				return nums2[(nums2.length - 1) / 2];
		}
		if(nums2.length == 0){
			if(nums1.length % 2 == 0)
				return (nums1[(nums1.length - 1) / 2] + nums1[(nums1.length - 1) / 2 + 1]) / 2.0;
			else
				return nums1[(nums1.length - 1) / 2];
		}
		int i = 0, j = 0;
		List<Integer> list = new ArrayList<>();
		while(i < nums1.length && j < nums2.length){
			while(i < nums1.length && j < nums2.length && nums1[i] < nums2[j]){
				list.add(nums1[i]);
				i ++;
			}
			while(i < nums1.length && j < nums2.length && nums1[i] >= nums2[j]){
				list.add(nums2[j]);
				j ++;
			}
		}
		while(i < nums1.length){
			list.add(nums1[i]);
			i ++;
		}
		while(j < nums2.length){
			list.add(nums2[j]);
			j ++;
		}
		Object[] ret = list.toArray();
		if(ret.length % 2 == 0)
			return ((int)ret[(ret.length - 1) / 2] + (int)ret[(ret.length - 1) / 2 + 1]) / 2.0;
		else
			return (int)ret[(ret.length - 1) / 2];
	}
	
	public static void main(String[] args){
		int[] nums1 = {1, 1};
		int[] nums2 = {1, 2};
		double a = findMedianSortedArrays(nums1, nums2);
		System.out.println(a);
	}
}
