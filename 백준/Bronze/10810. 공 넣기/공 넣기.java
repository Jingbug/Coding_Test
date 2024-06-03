import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int basket[] = new int[Integer.parseInt(token.nextToken())];
        int ball = Integer.parseInt(token.nextToken());

        for (int i = 0; i < ball; i++) {
            String[] strings = br.readLine().split(" ");
            for (int j = Integer.parseInt(strings[0]); j <= Integer.parseInt(strings[1]); j++) {
                basket[j-1] = Integer.parseInt(strings[2]);
            }
        }
        for (Integer i : basket) {
            System.out.print(i + " ");
        }
    }
}