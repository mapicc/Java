package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by zhaoguanjun on 2016/8/28.
 */
public class _378KthSmallestElementinaSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                queue.offer(matrix[i][j]);
            }
        }
        for (int i = 0; i < k - 1; i++) {
            queue.poll();
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        _378KthSmallestElementinaSortedMatrix t = new _378KthSmallestElementinaSortedMatrix();
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        System.out.println(t.kthSmallest(matrix, 8));
    }
}
