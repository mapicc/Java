package newCode;

/**
 * Created by guanjun on 2016/9/7.
 */
public class GetMaxLength {
    public static int getMaxLength(int[] arr, int k) {
        int left = 0, right = 0;
        int sum = arr[0];
        int ret = 0;
        while (right < arr.length) {
            if (sum == k) {
                ret = Math.max(ret, right - left + 1);
                sum -= arr[left++];
            }else if (sum < k) {
                if (right < arr.length - 1)
                    sum += arr[++right];
                else
                    break;
            }else {
                sum -= arr[left++];
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1};
        System.out.println(getMaxLength(arr, 3));
    }
}
