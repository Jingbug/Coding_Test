import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int sum = 0;

        String num = br.readLine();
        String[] strings = num.split("");
        for (String string : strings) {
            sum += Integer.parseInt(string);
        }
        System.out.println(sum);
    }
}