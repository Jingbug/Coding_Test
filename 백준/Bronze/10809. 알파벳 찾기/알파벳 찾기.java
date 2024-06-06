import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] list = new int[str.length()];
        int[] result = new int[26];
        for (int i = 0; i < str.length(); i++) {
            list[i] = str.charAt(i);
        }

        for (int i = 0; i < 26; i++) {
            result[i] = -1;
            for (int j = 0; j < list.length; j++) {
                if((i+97) == list[j]) {
                    if(result[i] != -1) break;
                    result[i] = j;
                }
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}