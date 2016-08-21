package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guanjun on 2016/8/21.
 */
public class _36ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map[] row = new Map[9];
        Map[] col = new Map[9];
        Map[] squ = new Map[9];
        for (int i = 0; i < 9; i++) {
            row[i] = new HashMap<Character, Integer>();
            col[i] = new HashMap<Character, Integer>();
            squ[i] = new HashMap<Character, Integer>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                if (row[i].containsKey(board[i][j]) || col[j].containsKey(board[i][j]) || squ[i/3 * 3 + j/3].containsKey(board[i][j]))
                    return false;
                row[i].put(board[i][j], 1);
                col[j].put(board[i][j], 1);
                squ[i/3 * 3 + j/3].put(board[i][j], 1);
            }
        }
        return true;
    }
}
