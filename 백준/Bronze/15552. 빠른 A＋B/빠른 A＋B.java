import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(bf.readLine());

        for (int i = 0; i < cnt; i++) {
            String str = bf.readLine();
            StringTokenizer tokenizer = new StringTokenizer(str);
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            int sum = a + b;
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}
