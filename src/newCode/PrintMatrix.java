package newCode;

/**
 * Created by guanjun on 2016/7/10.
 */
public class PrintMatrix {
    public static void printMatrix (int[][] matrix){
        if (matrix == null)
            return;
        int ix = 0, iy = 0;
        int jx = matrix[0].length - 1, jy = matrix.length - 1;
        while (ix <= jx && iy <= jy) {
            int index = ix;
            while (index <= jx){
                System.out.print(matrix[ix][index++] + " ");
            }
            index = iy + 1;
            while (index <= jy){
                System.out.print(matrix[index++][jx] + " ");
            }
            index = jx - 1;
            while (index >= ix){
                System.out.print(matrix[jy][index--] + " ");
            }
            index = jy - 1;
            while (index > iy){
                System.out.print(matrix[index--][ix] + " ");
            }
            ix++;
            iy++;
            jx--;
            jy--;
        }
    }

    public static void main(String[] args){
        int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printMatrix(a);
    }
}
