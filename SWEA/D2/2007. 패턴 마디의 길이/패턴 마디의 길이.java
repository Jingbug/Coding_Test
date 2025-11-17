import java.util.Scanner;

class Solution {
    private static int findPatternLength(String s) {
        for (int len = 1; len <= 10; len++) {
            String pattern = s.substring(0, len);
            boolean ok = true;

            for (int i = len; i < s.length(); i += len) {
                if (i + len > s.length()) break;
                String part = s.substring(i, i + len);
                if (!pattern.equals(part)) {
                    ok = false;
                    break;
                }
            }
            if (ok) return len;
        }
        return 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int testCase = 1; testCase <= T; testCase++) {
            String s = sc.nextLine().trim();
            int answer = findPatternLength(s);
            System.out.println("#" + testCase + " " + answer);
        }
    }
}