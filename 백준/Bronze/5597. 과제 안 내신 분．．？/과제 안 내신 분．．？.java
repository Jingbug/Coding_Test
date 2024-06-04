import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int list [] = new int[30];
        for (int i = 1; i <= 28; i++) {
            int anInt = Integer.parseInt(br.readLine());
            list[anInt-1] = anInt;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] == 0) System.out.println(i+1);
        }
    }
}