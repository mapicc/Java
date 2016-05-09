package leetcode;

public class _26RemoveDuplicatesfromSortedArray {

	public static int removeDuplicates(int[] nums) {
        if(nums.length < 1)
        	return 0;
        int len = nums.length;
        int index = len;
        int i = len - 2,j = len - 1;
        while(i >= 0){
        	if(nums[i] == nums[j]){
        		int k = i;
        		while(k < len - 1)
        			nums[k] = nums[++k];
        		index --;
        	}
        	i --;
        	j --;
        }
        return index;
    }
	
	public static int removeDuplicates_2(int nums[]){
		if(nums.length < 1)
			return 0;
		int first = 0,second = 1;
		while(second < nums.length){
			if(nums[first] != nums[second]){
				first ++;
				nums[first] = nums[second];
			}else{
				second ++;
			}
		}
		return first + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,1,2};
		System.out.println(removeDuplicates_2(nums));
	}

}
