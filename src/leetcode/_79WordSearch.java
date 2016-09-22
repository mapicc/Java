package leetcode;

/**
 * Created by zhaoguanjun on 2016/9/22.
 */
public class _79WordSearch {
    public boolean exist(char[][] board, String word) {
        if(word == null || word.length() == 0)
            return true;
        char start = word.charAt(0);
        int[][] visit = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == start) {
                    visit[i][j] = 1;
                    if(dfs(board, i, j, word, 1, visit))
                        return true;
                }
                visit[i][j] = 0;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, String word, int k, int[][] visit) {
        if(k == word.length())
            return true;
        if(i + 1 < board.length && visit[i + 1][j] == 0 && board[i + 1][j] == word.charAt(k)) {
            visit[i + 1][j] = 1;
            if(dfs(board, i + 1, j, word, k + 1, visit))
                return true;
            visit[i + 1][j] = 0;
        }

        if(i > 0 && visit[i - 1][j] == 0 && board[i - 1][j] == word.charAt(k)) {
            visit[i - 1][j] = 1;
            if(dfs(board, i - 1, j, word, k + 1, visit))
                return true;
            visit[i - 1][j] = 0;
        }

        if(j + 1 < board[0].length && visit[i][j + 1] == 0 && board[i][j + 1] == word.charAt(k)) {
            visit[i][j + 1] = 1;
            if(dfs(board, i, j + 1, word, k + 1, visit))
                return true;
            visit[i][j + 1] = 0;
        }

        if(j > 0 && visit[i][j - 1] == 0 && board[i][j - 1] == word.charAt(k)) {
            visit[i][j - 1] = 1;
            if(dfs(board, i, j - 1, word, k + 1, visit))
                return true;
            visit[i][j - 1] = 0;
        }

        return false;
    }
}
