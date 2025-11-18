import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    private static int sideCalculator(int [] arr, int idx) {
        int result = 0;
        int pos = arr[idx], lPos = arr[idx-1], l2Pos = arr[idx-2], rPos = arr[idx+1], r2Pos = arr[idx+2];
        if (pos > lPos && pos > rPos && pos > l2Pos && pos > r2Pos) {
            result = pos - Math.max(Math.max(lPos, rPos), Math.max(l2Pos,r2Pos));
        }
        return result;
    }
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        //T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int [] height = new int[N];
            for(int i = 0; i < N; i++) {
                height[i] = sc.nextInt();
            }

            int sum = 0;
            for(int i = 2; i < N-2; i++) {
                sum += sideCalculator(height, i);
            }

            System.out.println("#" + test_case + " " + sum);
        }
    }
}