import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zhaoguanjun on 2016/8/14.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        Map<Character, Integer> map = new HashMap<>();
        while (scanner.hasNextLine()) {
            int timeStamp = 0;
            line = scanner.nextLine();
            char[] lineChar = line.toCharArray();
            for (int i = 0; i < lineChar.length; i++) {
                if (map.containsKey(lineChar[i])) {
                    map.put(lineChar[i], map.get(lineChar[i]));
                }else {
                    map.put(lineChar[i], timeStamp++);
                }
            }
            ArrayList<Map.Entry> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry>() {
                @Override
                public int compare(Map.Entry o1, Map.Entry o2) {
                    int o1timeStamp = (int)o1.getValue();
                    int o2timeStamp = (int)o2.getValue();
                    return o1timeStamp < o2timeStamp ? -1 : 1;
                }
            });
            Iterator<Map.Entry> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next().getKey());
            }
            System.out.println();
        }
    }
}
