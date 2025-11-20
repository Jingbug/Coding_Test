import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();

            int count = 0;
            Set<Integer> digits = new HashSet<>();

            while (digits.size() < 10) {
                count++;
                int value = count * n;

                char[] arr = String.valueOf(value).toCharArray();
                for (char c : arr) {
                    digits.add(c - '0');
                }
            }
            System.out.println("#" + test_case + " " + count*n);
        }
    }
}
