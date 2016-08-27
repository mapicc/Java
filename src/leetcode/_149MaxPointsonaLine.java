package leetcode;

import java.util.*;

/**
 * Created by zhaoguanjun on 2016/8/27.
 */
public class _149MaxPointsonaLine {
    public static void main(String[] args) {
        _149MaxPointsonaLine t = new _149MaxPointsonaLine();
        Point[] points = new Point[3];
        points[0] = new Point(2, 3);
        points[1] = new Point(3, 3);
        points[2] = new Point(-5, 3);
        System.out.println(t.maxPoints2(points));
    }
    public int maxPoints(Point[] points) {
        if(points.length < 2)
            return points.length;
        Map<Double, Integer> map = new HashMap<>();

        for(int i = 0; i < points.length - 1; i++) {
            for(int j = i + 1; j < points.length; j++) {
                double k = functionK(points[i], points[j]);
                map.put(k, map.getOrDefault(k, 0) + 1);
            }
        }
        List<Map.Entry<Double, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, ((o1, o2) -> o1.getValue() < o2.getValue() ? 1 : (o1.getValue() == o2.getValue() ? 0 : -1)));
        return list.get(0).getValue();
    }

    public double functionK(Point a, Point b) {
        double k;
        if(a.x != b.x) {
            k = (double) (a.y - b.y) / (a.x - b.x);
        }else {
            k = (double)Integer.MAX_VALUE;
        }
        return k;
    }

    public double functionC(Point a, Point b) {
        double k = functionK(a, b);
        return a.y - k * a.x;
    }

    public int maxPoints2(Point[] points) {
        if(points.length < 2)
            return points.length;
        int max = 0;
        for(int i = 0; i < points.length - 1; i++) {
            Map<Double, Integer> map = new HashMap<>();
            int sameX = 1, sameP = 0;
            for(int j = i + 1; j < points.length; j++) {
                if(points[i].x == points[j].x) {
                    sameX++;
                    if(points[i].y == points[j].y)
                        sameP++;
                }else {
                    double k = (points[i].y == points[j].y) ? 0.0 : (double) (points[i].y - points[j].y) / (points[i].x - points[j].x);
                    map.put(k, map.getOrDefault(k, 1) + 1);
                }
            }
            int max2 = 0;
            for(Map.Entry<Double, Integer> entry : map.entrySet()) {
                if(entry.getValue() > max2)
                    max2 = entry.getValue();
            }
            max2 +=sameP;
            if(sameX > max2)
                max2 = sameX;
            if(max2 > max)
                max = max2;
        }
        return max;
    }
}

class Point {
    int x;
    int y;
    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int a, int b) {
        this.x = a;
        this.y = b;
    }
}
