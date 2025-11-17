import java.util.Scanner;

class Solution {

    private static int calc(int [][] arr, int x, int y, int size) {
        int sum = 0;
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int [][] arr = new int[N][N];
            int idx = N - M + 1;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int result = Integer.MIN_VALUE;
            for (int i = 0; i < idx; i++) {
                for (int j = 0; j < idx; j++) {
                    int tmp = calc(arr, i, j, M);
                    if (tmp > result) result = tmp;
                }
            }

            System.out.println("#" + test_case + " " + result);
        }
    }
}