import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        int diagonal = 1;
        int tempX = cnt;
        while (tempX > diagonal) {
            tempX -= diagonal;
            diagonal++;
        }

        int numerator, denominator;
        if (diagonal % 2 == 0) {
            numerator = tempX;
            denominator = diagonal - tempX + 1;
        } else {
            numerator = diagonal - tempX + 1;
            denominator = tempX;
        }

        System.out.println(numerator + "/" + denominator);
    }
}

