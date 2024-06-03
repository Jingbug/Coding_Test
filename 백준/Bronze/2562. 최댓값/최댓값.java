import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = 9, max = 1, pos = 0;
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(br.readLine());
            if(max < n) {
                max = n;
                pos = i+1;
            }
        }
        System.out.println(max + "\n" + pos);
    }
}