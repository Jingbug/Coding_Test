import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().trim().toCharArray();
        int result = c.length;
        int cnt = 0;

        for (int i = 0; i < c.length; i++) {
            if(c[i] == '-' || c[i] == '=') {
                cnt++;
                if(i > 1 && c[i-1] == 'z' && c[i-2] == 'd') result--;
            }
            else if(c[i] == 'l' || c[i] == 'n') {
                if(i < c.length - 1 && c[i+1] == 'j') result--;
            }
        }
        result = result - cnt;
        System.out.println(result);
    }
}
