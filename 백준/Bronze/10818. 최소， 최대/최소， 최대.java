import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cnt = br.readLine();
        int anIntCnt = Integer.parseInt(cnt);

        String numList = br.readLine();
        String[] strings = new String[anIntCnt];
        strings = numList.split(" ");
        String max = strings[0], min = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if((Integer.parseInt(max) < Integer.parseInt(strings[i]))) max = strings[i];
            if((Integer.parseInt(min) > Integer.parseInt(strings[i]))) min = strings[i];
        }
        System.out.println(min + " " + max);
    }
}
