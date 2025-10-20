import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class Solution {
    public long solution(long n) {
        int[] array = String.valueOf(n).chars().map(c -> c - '0').sorted().toArray();

        List<Integer> list = IntStream.of(array)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i);
        }
        return Long.parseLong(sb.toString());
    }
}