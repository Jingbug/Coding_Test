import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt(), sum = 0;

        for (int i = 0; i < 2; i++) {
            int x = scan.nextInt();
            if (max < x) {
                sum += max;
                max = x;
            } else  sum += x;
        }

        if (sum > max) System.out.println(sum + max);
        else System.out.println(sum + sum - 1);
    }
}