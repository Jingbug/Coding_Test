import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            list.add(str);
        }

        for (String s : list) {
            System.out.println(s.charAt(0) + "" + s.charAt(s.length()-1));
        }
    }
}