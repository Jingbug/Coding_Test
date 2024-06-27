import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> strArr = new ArrayList<>();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> arr = new ArrayList<>();
            String str = n + " = 1";
            int sum = 0;
            if(n == -1) break;

            for (int i = 1; i < n; i++) {
                if(n%i == 0) {
                    sum += i;
                    if(i != 1) arr.add(i);
                }
            }
            if(sum == n) {
                for (Integer i : arr) {
                    str += " + " + i;
                }
                strArr.add(str);
            } else {
                strArr.add(n + " is NOT perfect.");
            }
        }
        for (String str : strArr) {
            System.out.println(str);
        }
    }
}

