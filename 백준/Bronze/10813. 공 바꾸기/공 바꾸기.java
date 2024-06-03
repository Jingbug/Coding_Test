import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int temp;
        int basket_cnt = Integer.parseInt(token.nextToken());
        int basket[] = new int[basket_cnt];
        int ball_cnt = Integer.parseInt(token.nextToken());

        for (int i = 0; i < basket_cnt; i++) basket[i] = i+1;

        for (int i = 0; i < ball_cnt; i++) {
            String[] strings = br.readLine().split(" ");
            temp = basket[Integer.parseInt(strings[0])-1];
            basket[Integer.parseInt(strings[0])-1] = basket[Integer.parseInt(strings[1])-1];
            basket[Integer.parseInt(strings[1])-1] = temp;
        }
        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}