import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int line = Integer.parseInt(br.readLine());
        int rule = 0;

        for (int i = 0; i < line * 2 - 1; i++) {
            for (int j = 1; j <= line * 2 - 1; j++) {
                if(j >= line - rule && j <= line + rule) {
                    System.out.print("*");
                } else {
                    if(j > line + rule) break;
                    System.out.print(" ");
                }
            }
            if(i < line-1) rule++;
            else rule--;
            if(i == line * 2 -2) break;
            System.out.println();
        }
    }
}
