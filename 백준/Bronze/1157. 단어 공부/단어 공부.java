import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Integer> list = new HashMap<>();
        String str = br.readLine();
        int maxChr = 0, cnt = 0;

        for (char c : str.toUpperCase().toCharArray()) {
            list.put(c, list.getOrDefault(c, 0) + 1);
        }

        for (Integer value : list.values()) {
            if(maxChr < value) maxChr = value;
        }

        for (Integer value : list.values()) {
            if(maxChr == value) cnt += 1;
        }

        if(cnt > 1) System.out.println("?");
        else {
            for (Map.Entry<Character, Integer> characterIntegerEntry : list.entrySet()) {
                if(characterIntegerEntry.getValue() == maxChr) System.out.println(characterIntegerEntry.getKey());
            }
        }
    }
}
