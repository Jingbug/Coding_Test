import java.util.Scanner;

class Solution {
    private static int countOccurrences(String key, String text) {
        int pos = 0;
        int cnt = 0;
        int keyLen = key.length();

        while ((pos = text.indexOf(key, pos)) != -1) {
            cnt++;
            pos += keyLen; // 겹치지 않게
        }
        return cnt;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int tc = sc.nextInt();
            String key = sc.next();
            String text = sc.next();

            int cnt = countOccurrences(key, text);

            System.out.println("#" + test_case + " " + cnt);
        }
    }
}
