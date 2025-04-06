import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), result = 0;

        for (int i = 0; i <= n/5; i++) {
            for (int j = 0; j <= n/3; j++) {
                if (n == 5*i + 3*j) {
                    result = i + j;
                    break;
                }
            }
        }
        if (result == 0) System.out.println("-1");
        else System.out.println(result);
    }
}
