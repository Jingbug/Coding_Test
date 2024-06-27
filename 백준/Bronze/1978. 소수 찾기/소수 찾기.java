import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        String[] strings = br.readLine().split(" ");

        for (String string : strings) {
            int  cnt = 0;
            int i = Integer.parseInt(string);
            for (int j = 1; j < i; j++) {
                if(i%j == 0) cnt++;
            }
            if(cnt == 1) result++;
        }

        System.out.println(result);
    }
}

