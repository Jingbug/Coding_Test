import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int anInt = Integer.parseInt(string), result = 0;

        for (int i = anInt; i > 0; i--) {
            int sum = 0;
            char[] charArray = Integer.toString(i).toCharArray();
            for (char c : charArray) {
                sum += Character.getNumericValue(c);
            }
            if (anInt == i + sum) result = i;
        }
        System.out.println(result);
    }
}