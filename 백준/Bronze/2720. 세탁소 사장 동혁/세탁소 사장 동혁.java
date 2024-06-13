import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int fix[] = {25, 10, 5, 1};
        int arr[][] = new int[cnt][fix.length];

        for (int i = 0; i < cnt; i++) {
            int payment = Integer.parseInt(br.readLine());
            for (int j = 0; j < fix.length; j++) {
                int count = 0;
                while (true) if (payment - fix[j] >= 0) {
                    count++;
                    payment -= fix[j];
                } else break;
                arr[i][j] = count;
            }
        }
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
