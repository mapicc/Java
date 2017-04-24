/**
 * Created by mapicc on 2017/4/24.
 */
public class Itheima {
    public static boolean has12(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] == 1)
                for (int j = arr.length - 1; j > i; j--)
                    if (arr[j] == 2)
                        return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2};
        System.out.println(has12(arr));
    }
}
