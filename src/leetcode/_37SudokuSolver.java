package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;

/**
 * Created by guanjun on 2016/8/21.
 */
public class _37SudokuSolver {
    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] squ = new int[9];
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    idx = 1 << board[i][j];
                    if ((row[i] & board[i][j]) > 0 || (col[j] & board[i][j]) > 0 || (squ[i / 3 * 3 + j / 3] & board[i][j]) > 0)
                        return false;
                    row[i] |= idx;
                    col[j] |= idx;
                    squ[i / 3 * 3 + j / 3] |= idx;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        if (isValidSudoku(board))
            return;
        Set[] row = new Set[9];
        Set[] col = new Set[9];
        Set[] squ = new Set[9];
        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<Character>();
            col[i] = new HashSet<Character>();
            squ[i] = new HashSet<Character>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    row[i].add(board[i][j]);
                    col[j].add(board[i][j]);
                    squ[i/3 * 3 + j/3].add(board[i][j]);
                }
            }
        }
        if (dfs(board, row, col, squ, 0)) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println(board[i][8]);
            }
        }
        
    }

    private boolean dfs(char[][] board, Set[] row, Set[] col, Set[] squ, int index) {
        if (index == 81)
            return true;
        int r = index / 9;
        int c = index % 9;
        int s = r/3*3 + c/3;
        if (board[r][c] == '.') {
            for (char i = '1'; i <= '9'; i++) {
                if (!row[r].contains(i) && !col[c].contains(i) && !squ[s].contains(i)) {
                    row[r].add(i);
                    col[c].add(i);
                    squ[s].add(i);
                    board[r][c] = i;
                    if (dfs(board, row, col, squ, index + 1))
                        return true;
                    else {
                        row[r].remove(i);
                        col[c].remove(i);
                        squ[s].remove(i);
                        board[r][c] = '.';
                    }
                }
            }
        }else {
            return dfs(board, row, col, squ, index + 1);
        }
        return false;
    }
}
