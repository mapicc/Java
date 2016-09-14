import java.util.*;

public class Main15 {
    public static void helper(Tnode t, int[] ret) {
        if (t == null)
            return;
        ret[0] += t.value;
        if (t.left != null) {
            helper(t.left, ret);
            return;
        }
        if (t.right != null) {
            helper(t.right, ret);
        }
    }

    public static int solution(Tnode t) {
        int[] ret = new int[1];
        helper(t, ret);
        return ret[0];
    }

    public static void main(String[] args) {

    }
}
class Tnode {
    int value;
    Tnode left;
    Tnode right;
}