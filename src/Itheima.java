/**
 * Created by mapicc on 2017/4/24.
 */
public class Itheima {
    public boolean has12(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 1 && arr[i + 1] == 2)
                return true;
        }
        return false;
    }
}
