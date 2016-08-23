package leetcode;

/**
 * Created by guanjun on 2016/8/23.
 */
public class _223RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int aArea = (C - A) * (D - B);
        int bArea = (G - E) * (H - F);
        int abs = 0;
        int xBottom = Math.max(A, E);
        int yBottom = Math.max(B, F);
        int xTop = Math.min(G, C);
        int yTop = Math.min(H, D);
        if (xBottom < xTop && yBottom < yTop)
            abs = (xTop - xBottom) * (yTop - yBottom);
        return aArea + bArea - abs;
    }
}
