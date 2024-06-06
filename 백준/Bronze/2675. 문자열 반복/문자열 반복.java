import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int scnt[] = new int[cnt];
        String slist[] = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            String[] strings = br.readLine().split(" ");
            scnt[i] = Integer.parseInt(strings[0]);
            slist[i] = strings[1];
        }

        for (int i = 0; i < cnt; i++) {
            String[] strings = slist[i].split("");
            for (String string : strings) {
                for (int j = 0; j < scnt[i]; j++) {
                    System.out.print(string);
                }
            }
            System.out.println();
        }
    }
}