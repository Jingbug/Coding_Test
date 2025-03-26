import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        while (true) {
            int x = scan.nextInt(), y = scan.nextInt(), z = scan.nextInt();

            set.add(x);
            set.add(y);
            set.add(z);

            if (x == 0 && y == 0 && z == 0) break;
            else if (x + y <= z || y + z <= x || x + z <= y) list.add("Invalid");
            else if (set.size() == 2) list.add("Isosceles");
            else if (set.size() == 3) list.add("Scalene");
            else list.add("Equilateral");

            set.clear();
        }
        for (String s : list) System.out.println(s);
    }
}