import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String arr[] = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = br.readLine();
        }

        for (String s : arr) {
            Set<Character> set = new HashSet<>();
            char lastChar = '\0';
            char[] charArray = s.toCharArray();
            for (char c : charArray) {
                if (c != lastChar) {
                    if (set.contains(c)) {
                        cnt--;
                        break;
                    }
                    set.add(c);
                    lastChar = c;
                }
            }
        }
        System.out.println(cnt);
    }
}
