import java.util.*;

/**
 * Created by zhaoguanjun on 2016/8/6.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line, fileName;
        int timeStamp = 0;
        Map<String, String> map = new HashMap<>();
        while (!(line = scanner.nextLine()).equals("")) {
            String first = line.split(" ")[0];
            String last = line.split(" ")[1];
            fileName = first.substring(first.lastIndexOf("\\") + 1);
            if (map.containsKey(fileName + " " + last)){
                map.put(fileName + " " + last, Integer.valueOf(map.get(fileName + " " + last).split(" ")[0]) + 1 + " " + map.get(fileName + " " + last).split(" ")[1]);
            }else {
                map.put(fileName + " " + last, 1 + " " + timeStamp++);
            }
        }
        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                int o1Value = Integer.valueOf(o1.getValue().split(" ")[0]);
                int o2Value = Integer.valueOf(o2.getValue().split(" ")[0]);
                int o1timeStamp = Integer.valueOf(o1.getValue().split(" ")[1]);
                int o2timeStamp = Integer.valueOf(o2.getValue().split(" ")[1]);
                if (o1Value != o2Value) {
                    return o1Value < o2Value ? 1 : -1;
                }else {
                    return o1timeStamp < o2timeStamp ? -1 : 1;
                }
            }
        });
        for (int i = 0; i < Math.min(8, list.size()); i++) {
            String ret = list.get(i).getKey().split(" ")[0];
            String left = list.get(i).getKey().split(" ")[1];
            if (ret.length() > 16) {
                ret = ret.substring(ret.length() - 16);
            }
            System.out.println(ret + " " + left + " " + list.get(i).getValue().split(" ")[0]);
        }
    }
}
