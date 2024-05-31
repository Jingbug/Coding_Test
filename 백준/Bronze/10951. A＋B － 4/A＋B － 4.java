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
            if(str==null) break;
            StringTokenizer tokenizer = new StringTokenizer(str);
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());

            result.add(a+b);
        }
        for (Integer integer : result) {
            bw.write(integer + "\n");
        }
        bw.flush();
        bw.close();
    }
}
