import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        String[] strings = br.readLine().split("");
        for (int i = 0; i < strings.length; i++) {
            if(i <= strings.length-i-1){
                if(strings[i].equals(strings[strings.length-i-1])) result += 1;
            }
        }
        if(strings.length/2 <= result) System.out.println(1);
        else System.out.println(0);
    }
}
