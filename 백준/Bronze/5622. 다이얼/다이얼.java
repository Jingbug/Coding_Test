import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(65 <= c && c <= 67) sum += 3;
            else if(68 <= c && c <= 70) sum += 4;
            else if(71 <= c && c <= 73) sum += 5;
            else if(74 <= c && c <= 76) sum += 6;
            else if(77 <= c && c <= 79) sum += 7;
            else if(80 <= c && c <= 83) sum += 8;
            else if(84 <= c && c <= 86) sum += 9;
            else if(87 <= c && c <= 90) sum += 10;
            else sum += 11;
        }
        System.out.println(sum);
    }
}
