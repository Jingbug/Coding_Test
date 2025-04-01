import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), a0 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        int cal = (a1 - c) * n + a0;

        if (cal <= 0) {
            if (a1 - c > 0 && a0 < 0 && a1 - c < Math.abs(a0)) {
                System.out.println("0");
            }
            else System.out.println("1");
        }
        else System.out.println("0");
    }
}