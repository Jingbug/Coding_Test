import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        tokenizer = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(tokenizer.nextToken());
        int cnt = Integer.parseInt(tokenizer.nextToken());
        int[] list = new int[size];
        int temp;

        for (int i = 0; i < size; i++) {
            list[i] = i+1;
        }

        for (int i = 0; i < cnt; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            int c = a + b - 1;
            for (int j = a; j < b; j++) {
                if((j-1) >= (c-j)) break;
                temp = list[j-1];
                list[j-1] = list[c-j];
                list[c-j] = temp;
            }
        }
        for (int k : list) {
            System.out.print(k + " ");
        }
    }
}