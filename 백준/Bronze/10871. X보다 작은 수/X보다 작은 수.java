import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s = br.readLine();
        st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        String numList = br.readLine();
        String[] strings = numList.split(" ");
        for (String string : strings) {
            if(x > Integer.parseInt(string)) System.out.print(string + " ");
        }

    }
}
