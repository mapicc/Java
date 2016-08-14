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
            
            dfs(data, row, col, squ, 0);
            
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (j != 8) {
                        System.out.print(data[i][j] + " ");
                    }else {
                        System.out.println(data[i][j]);
                    }
                }
            }
        }
        scanner.close();
    }

    private static boolean dfs(int[][] data, List<HashSet<Integer>> row, List<HashSet<Integer>> col, List<HashSet<Integer>> squ, int index) {
        if (index == 81)
            return true;
        int m = index / 9;
        int n = index % 9;
        int k = m / 3 * 3 + n / 3;

        if (data[m][n] != 0) {
            return dfs(data, row, col, squ, index + 1);
        }else {
            for (int i = 1; i <= 9; i++) {
                if (!row.get(m).contains(i) && !col.get(n).contains(i) && !squ.get(k).contains(i)){
                    data[m][n] = i;
                    row.get(m).add(i);
                    col.get(n).add(i);
                    squ.get(k).add(i);
                    if (dfs(data, row, col, squ, index + 1))
                        return true;
                    data[m][n] = 0;
                    row.get(m).remove(i);
                    col.get(n).remove(i);
                    squ.get(k).remove(i);
                }
            }
            return false;
        }
    }
}
