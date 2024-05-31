import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> result = new ArrayList<>();

        while (true) {
            String str = br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(str);
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());

            if(a==0 && b==0) break;
            result.add(a+b);
        }
        for (Integer integer : result) {
            bw.write(integer + "\n");
        }
        bw.flush();
        bw.close();
    }
}
