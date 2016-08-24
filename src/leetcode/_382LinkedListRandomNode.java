package leetcode;


import java.util.Random;

/**
 * Created by zhaoguanjun on 2016/8/24.
 */
public class _382LinkedListRandomNode {
    private ListNode head;
    private Random random;
    public _382LinkedListRandomNode(ListNode head) {
        this.head = head;
        this.random = new Random();
    }

    public int getRandom() {
        ListNode current = head;
        ListNode ret = head;
        for (int i = 1; current != null; i++) {
            if (random.nextInt(i) == 0)
                ret = current;
            current = current.next;
        }
        return ret.val;
    }
}
