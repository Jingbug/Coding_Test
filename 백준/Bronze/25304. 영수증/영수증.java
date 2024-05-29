import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sumPrice = 0;
        Scanner scan = new Scanner(System.in);
        int totalPrice = scan.nextInt();
        int count = scan.nextInt();
        for(int i=0; i<count; i++) {
            int cnt = scan.nextInt();
            int price = scan.nextInt();
            sumPrice += cnt*price;
        }
        if(sumPrice==totalPrice) System.out.println("Yes");
        else System.out.println("No");
    }
}
