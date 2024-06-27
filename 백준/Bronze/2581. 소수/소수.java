import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0, min = 0;

        for (int i = m; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j < i; j++) {
                if(i%j == 0) cnt++;
            }
            if(cnt == 1) {
                sum += i;
                if(min == 0) min = i;
                else if(min > i) min = i;
            }
        }

        if(sum + min == 0) System.out.println(-1);
        else System.out.println(sum + "\n" + min);
    }
}

