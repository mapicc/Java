package priorityQueue;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by zhaoguanjun on 2016/8/28.
 */
public class PriorityQueueExample {

    public static void main(String[] args) {
        Person p1 = new Person("a", 11);
        Person p2 = new Person("b", 12);
        Person p3 = new Person("A", 9);
        Queue<Person> queue = new PriorityQueue<>(((o1, o2) -> o1.age - o2.age));
        queue.offer(p1);
        queue.offer(p2);
        queue.offer(p3);

        System.out.println("-------通过迭代器遍历-------");
        Iterator<Person> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /**
         * 优先级队列： 将年龄作为优先级
         */
        System.out.println("-------对头至队尾-------");
        for (int i = 0; i < 3; i++) {
            System.out.println(queue.poll().toString());
        }
    }

}
