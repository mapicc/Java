package leetcode;

import java.util.HashSet;
import java.util.Set;

public class _217ContainsDuplicate {
	public boolean containDuplicate(int[] nums){
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++){
			set.add(nums[i]);
		}
		if(set.size() == nums.length)
			return false;
		else
			return true;
	}
}
