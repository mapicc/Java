package leetcode;

/**
 * Created by guanjun on 2016/7/10.
 */
public class _27RemoveElement {
    public static int removeElement(int[] nums, int val){
        if(nums == null || nums.length == 0)
            return 0;
        int count = 0;
        int i = 0, j = nums.length - 1;
        while(i <= j){
            if(nums[i] == val && nums[j] != val){
                nums[i++] = nums[j];
                nums[j--] = val;
                count++;
            }else if(nums[i] == val && nums[j] == val){
                j--;
                count++;
            }else{
                i++;
            }
        }
        return nums.length - count;
    }

    public static void main(String[] args){
        int[] a = {3,2,1,2,3,4,1};
        System.out.println(removeElement(a,3));
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
