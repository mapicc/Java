import java.util.*;

/**
 * Created by zhaoguanjun on 2016/8/14.
 */
public class Main1 {
    public static int delete(List<Integer> list, int start) {
        if (list.size() == 1)
            return list.get(0);
        int size = list.size();
        List<Integer> tmp = new ArrayList<>();
        int i;
        for (i = start + 3; i < size;) {
            tmp.add(i);
            i += 3;
        }
        for (int j = tmp.size() - 1; j >= 0; j--) {
            list.remove(list.get(tmp.get(j)));
        }
        int remain = size - i + 2;
        return delete(list, -remain - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            n = n > 1000 ? 1000 : n;
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            System.out.print(delete(list, -1));
        }
    }
}
