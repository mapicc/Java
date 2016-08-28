package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by zhaoguanjun on 2016/8/28.
 */
public class _373FindKPairswithSmallestSums {
        public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            List<int[]> ret = new ArrayList<>();
            if (nums1.length == 0 || nums2.length == 0)
                return ret;
            Queue<Node> queue = new PriorityQueue<>();
            for (int i = 0; i < nums2.length; i++) {
                queue.offer(new Node(0, i, nums1[0] + nums2[i]));
            }
            k = (k > nums1.length * nums2.length ? nums1.length * nums2.length : k);
            for (int i = 0; i < k; i++) {
                Node peek = queue.poll();
                int[] tmp = new int[2];
                tmp[0] = nums1[peek.x];
                tmp[1] = nums2[peek.y];
                ret.add(tmp);
                if (peek.x == nums1.length - 1)
                    continue;
                queue.offer(new Node(peek.x + 1, peek.y, nums1[peek.x + 1] + nums2[peek.y]));
            }
            return ret;
        }


    }

class Node implements Comparable<Node> {
    int x, y, val;
    Node(int a, int b, int val) {
        this.x = a;
        this.y = b;
        this.val = val;
    }

    public int compareTo(Node that) {
        return this.val - that.val;
    }
}
