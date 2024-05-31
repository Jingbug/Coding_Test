import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        String s = br.readLine();
        int cnt = Integer.parseInt(s);

        String numList = br.readLine();
        String[] strings = new String[cnt];
        strings = numList.split(" ");

        String r = br.readLine();
        for(String s1 : strings) {
            if(s1.equals(r)) sum++;
        }
        System.out.println(sum);
    }
}
