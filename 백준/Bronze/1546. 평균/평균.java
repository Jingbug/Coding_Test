import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        int cnt = Integer.parseInt(br.readLine());
        double list[] = new double[cnt];
        int max = 0;
        double sum = 0;

        tokenizer = new StringTokenizer(br.readLine());

        for (int i = 0; i < cnt; i++) {
            int score = Integer.parseInt(tokenizer.nextToken());
            list[i] = score;
            if(max < score) max = score;
        }

        for (double i : list) {
            double fscore = i/max*100;
            sum += fscore;
        }

        System.out.printf("%.2f", sum/cnt);
    }
}