import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int sum = 1, area = 1;

        while(true) {
            if(num <= sum) break;
            sum += (6*area);
            area++;
        }

        System.out.println(area);
    }
}
