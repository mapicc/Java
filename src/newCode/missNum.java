package newCode;

/**
 * Created by zhaoguanjun on 2016/9/2.
 */
public class missNum {
    public int missNum(int[] nums) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            if (nums[l] == l + 1)
                l++;
            else if (nums[l] <= l || nums[l] > r || nums[nums[l] - 1] == nums[l]) {
                nums[l] = nums[--r];
            }else {
                int tmp = nums[l] - 1;
                int tmp2 = nums[l];
                nums[l] = nums[tmp];
                nums[tmp] = tmp2;
            }
        }
        return l + 1;
    }

    public static void main(String[] args) {
        missNum t = new missNum();
        int[] a = {2, 1, 5, 3, 6};
        System.out.println(t.missNum(a));
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
