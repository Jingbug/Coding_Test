import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strings = br.readLine().split("");
        int [] numbers = new int[strings.length];

        for(int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            bw.write(Integer.toString(numbers[numbers.length-1-i]));
        }

        bw.flush();
        br.close();}
}
