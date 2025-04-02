import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), temp = 0;
        int [] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 2; i++) {
            int sum = 0;
            sum += arr[i];
            for (int j = i + 1; j < n - 1; j++) {
                sum += arr[j];
                for (int k = j + 1; k < n; k++) {
                    sum += arr[k];
                    if (sum <= m && temp < sum) temp = sum;
                    sum -= arr[k];
                }
                sum -= arr[j];
            }
        }
        System.out.println(temp);
    }
}