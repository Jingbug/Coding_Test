import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);
        long v = Long.parseLong(s[2]);

        int result = 0;

        result = (int) ((v - b - 1) / (a - b) + 1);

        System.out.println(result);
    }
}