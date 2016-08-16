import java.util.Scanner;
import java.util.Stack;

/**
 * Created by guanjun on 2016/8/16.
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            Stack<Node> stack = new Stack<>();
            Node start = new Node(0, 0);
            Node end = new Node(m - 1, n - 1);
            int[][] dir = {{1, 0}, {0, 1}};
            int[][] visit = new int[n][m];
            visit[0][0] = 1;
            stack.push(start);
            while (!stack.isEmpty()) {
                boolean find = false;
                Node cur = stack.peek();
                if (cur.x == m - 1 && cur.y == n - 1)
                    break;
                for (int i = 0; i < 2; i++) {
                    Node nbr = new Node(cur.x + dir[i][0], cur.y + dir[i][1]);
                    if (nbr.x >= 0 && nbr.x < m && nbr.y >=0 && nbr.y < m && a[nbr.x][nbr.y] == 0 && visit[nbr.x][nbr.y] == 0) {
                        stack.push(nbr);
                        visit[nbr.x][nbr.y] = 1;
                        find = true;
                        break;
                    }
                }
                if (find)
                    continue;
                stack.pop();
            }
            while (!stack.isEmpty()) {
                Node tmp = stack.pop();
                System.out.println("(" + tmp.x + tmp.y + ")");
            }
        }
    }
}

class Node {
    int x;
    int y;
    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
