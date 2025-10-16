import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = commands.length;
        int [] answer = new int[n];
        for(int i = 0; i < n; i++) {
            int v = commands[i][0] - 1;
            int cnt = commands[i][1] -  commands[i][0] + 1;
            int [] arr = new int[cnt];
            for (int j = 0; j < cnt; j++) {
                arr[j] = array[v];
                v++;
            }
            int[] result = Arrays.stream(arr).sorted().toArray();
            answer[i] = result[commands[i][2] - 1]; 
        }
        return answer;
    }
}