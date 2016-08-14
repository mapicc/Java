import java.util.*;

/**
 * Created by zhaoguanjun on 2016/8/14.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Map<Integer, Integer> map = new HashMap<>();
        int[] a = new int[1000];
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int index = 0;
            while (index++ < n) {
                int cur = scanner.nextInt();
//            if (!map.containsKey(cur)) {
//                map.put(cur, timeStamp++);
//            }
                if (a[cur] == 0)
                    a[cur] = 1;
            }
            for (int i = 0; i < 1000; i++) {
                if (a[i] != 0)
                    System.out.println(i);
            }
//        List<Map.Entry> list = new ArrayList<>(map.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry>() {
//            @Override
//            public int compare(Map.Entry o1, Map.Entry o2) {
//                return (int)o1.getKey() < (int)o2.getKey() ? -1 : 1;
//            }
//        });
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getKey());
//        }
        }
    }
}
