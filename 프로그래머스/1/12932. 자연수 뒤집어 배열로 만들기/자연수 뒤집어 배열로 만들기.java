import java.util.*;
class Solution {
    public int[] solution(long n) {
        int[] array = String.valueOf(n).chars().map(v -> v - '0').toArray();
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }
}