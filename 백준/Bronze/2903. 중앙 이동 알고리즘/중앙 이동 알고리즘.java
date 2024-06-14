import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int first = 2, size, result = 0;

        if(n > 1) {
            for (int i = 0; i < n - 1; i++) {
                first += (int)Math.pow(2, i);
            }
        }
        size = first + (int)Math.pow(2, n-1);
        System.out.println((int)Math.pow(size, 2));
    }
}
