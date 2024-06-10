import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int b_chess[] = {1, 1, 2, 2, 2, 8};
        int w_chess[] = new int[6];

        String[] strings = br.readLine().split(" ");
        for (int i = 0; i < strings.length; i++) {
            w_chess[i] = b_chess[i] - Integer.parseInt(strings[i]);
        }
        for (int wChess : w_chess) {
            System.out.print(wChess + " ");
        }
    }
}
