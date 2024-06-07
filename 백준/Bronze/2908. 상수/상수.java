import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer;

        String[] strings = br.readLine().split(" ");
        stringBuffer = new StringBuffer(strings[0]);
        int a = Integer.parseInt(stringBuffer.reverse().toString());

        stringBuffer = new StringBuffer(strings[1]);
        int b = Integer.parseInt(stringBuffer.reverse().toString());

        if(a > b) System.out.println(a);
        else System.out.println(b);
    }
}
