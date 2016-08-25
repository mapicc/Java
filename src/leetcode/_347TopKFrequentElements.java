package leetcode;

import java.util.*;
import java.util.PriorityQueue;

/**
 * Created by zhaoguanjun on 2016/8/25.
 */
public class _347TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        /**
         * 下面是通过hashmap，尝试使用堆排序，但是堆排序虽然找到K次频数时间复杂度klog(n)，但是根据频数找数组元素时间复杂度kn；
         */
        PriorityQueue r = new PriorityQueue();
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i]))
//                map.put(nums[i], map.get(nums[i]) + 1);
//            else
//                map.put(nums[i], 1);
//        }
//        Set<Map.Entry> set = new HashSet<>(map.entrySet());
//        int[] mapEntry = new int[set.size()];
//        Iterator<Map.Entry> iterator = set.iterator();
//        int index = 0;
//        while (iterator.hasNext()) {
//            mapEntry[index] = (int)iterator.next().getValue();
//            index++;
//        }
//
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < k; i++) {
//            buildTree(mapEntry, i);
//
//        }
//        return list;

        /**
         * 通过桶排序，时间复杂度n
         */
        List[] listArray = new List[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int num : map.keySet()) {
            int frequency = map.get(num);
            if (listArray[frequency] == null) {
                listArray[frequency] = new ArrayList();
            }
            listArray[frequency].add(num);
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = nums.length - 1, count = 0; i >= 0 && count < k; i--) {
            if (listArray[i] != null) {
                if (count + listArray[i].size() < k) {
                    ret.addAll(listArray[i]);
                    count +=listArray[i].size();
                }else {
                    for (int j = 0; j < k - count; j++) {
                        ret.add((int)listArray[i].get(j));
                    }
                }
            }
        }
        return ret;
    }

    public void buildTree(int[] nums, int start) {
        for (int i = nums.length - 1; i > start + 1; i--) {
            if (nums[i] > nums[(i - 1) / 2])
                swap(nums, i, (i - 1) / 2);
        }
    }

    private void swap(int[] nums, int j, int i) {
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }

    public static void main(String[] args) {
        _347TopKFrequentElements t = new _347TopKFrequentElements();
        int[] a = {5, 4, 3, 6, 2, 9, 3, 2};
        System.out.println(t.topKFrequent(a, 3));
    }
}
