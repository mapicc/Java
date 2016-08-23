package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by guanjun on 2016/8/23.
 */
public class _225ImplementStackusingQueues {
    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    public void push(int x) {
        queue.offer(x);
    }

    public void pop() {
        while (queue.size() > 1) {
            queue2.offer(queue.poll());
        }
        queue.poll();
        while (!queue2.isEmpty())
            queue.offer(queue2.poll());
    }

    public int top() {
        while (!queue.isEmpty()) {
            queue2.offer(queue.poll());
        }
        int ret = -1;
        while (!queue2.isEmpty()) {
            if (queue2.size() == 1)
                ret = queue2.peek();
            queue.offer(queue2.poll());

        }

        return ret;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
