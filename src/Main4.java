import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zhaoguanjun on 2016/8/14.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int[][] data = new int[9][9];
            List<HashSet<Integer>> row = new ArrayList<>();
            List<HashSet<Integer>> col = new ArrayList<>();
            List<HashSet<Integer>> squ = new ArrayList<>();

            for (int i = 0; i < 9; i++) {
                row.add(new HashSet<>());
                col.add(new HashSet<>());
                squ.add(new HashSet<>());
            }

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    data[i][j] = scanner.nextInt();
                    if (data[i][j] != 0) {
                        row.get(i).add(data[i][j]);
                        col.get(j).add(data[i][j]);
                        squ.get(i / 3 * 3 + j / 3).add(data[i][j]);
                    }
                }
            }
            System.out.println(row);
            System.out.println(col);
            System.out.println(squ);
        }

    }
}
