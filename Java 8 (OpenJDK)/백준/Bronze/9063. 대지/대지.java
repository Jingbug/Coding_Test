import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        int x = scan.nextInt(), y = scan.nextInt();
        int max_x = x, max_y = y, min_x = x, min_y = y;

        for (int i = 0; i < count - 1; i++) {
            int ix = scan.nextInt(), iy = scan.nextInt();

            max_x = Math.max(max_x, ix);
            max_y = Math.max(max_y, iy);

            min_x = Math.min(min_x, ix);
            min_y = Math.min(min_y, iy);
        }

        int result = (max_x - min_x) * (max_y - min_y);
        System.out.println(result);
    }
}