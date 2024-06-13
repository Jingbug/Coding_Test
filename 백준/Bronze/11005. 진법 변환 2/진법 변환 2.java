import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();

        String[] strings = br.readLine().split(" ");

        int n = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);

        while(n > 0) {
            int remain = n % b;
            char digit;

            if(remain >= 10) {
                digit = (char) ('A' + (remain - 10));
            } else {
                digit = (char) ('0' + remain);
            }

            st.append(digit);
            n /= b;
        }
        st.reverse();
        System.out.println(st);
    }
}
