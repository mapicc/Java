import java.util.Scanner;

/**
 * Created by zhaoguanjun on 2016/9/1.
 */
public class Tencent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0, j = n - 1;
        int[][] ret = new int[n][n];
        int val = 1;
        while (i < j) {
            int index = i;
            while (index < j) {
                ret[i][index] = val++;
                index++;
            }
            index = i;
            while (index < j) {
                ret[index][j] = val++;
                index++;
            }
            index = j;
            while (index > i) {
                ret[j][index] = val++;
                index--;
            }
            index = j;
            while (index > i) {
                ret[index][i] = val++;
                index--;
            }
            i++;
            j--;
        }
        if (i == j) {
            ret[i][i] = val;
        }
        for (int m = 0; m < ret.length; m++) {
            for (int a = 0; a < ret[0].length; a++) {
                System.out.print(ret[m][a] + " ");
            }
        }
    }
}
