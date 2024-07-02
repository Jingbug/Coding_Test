import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[4];

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(tokenizer.nextToken());
        int y = Integer.parseInt(tokenizer.nextToken());
        int w = Integer.parseInt(tokenizer.nextToken());
        int h = Integer.parseInt(tokenizer.nextToken());

        arr[0] = Math.abs(w-x);
        arr[1] = Math.abs(x);
        arr[2] = Math.abs(h-y);
        arr[3] = Math.abs(y);
        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(temp > arr[i]) temp =  arr[i];
        }

        System.out.println(temp);
    }
}

