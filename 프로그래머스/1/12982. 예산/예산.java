import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int idx = 0;
        Arrays.sort(d);

        while (idx < d.length && d[idx] <= budget) {
            budget -= d[idx++];
        }

        return idx;
    }
}