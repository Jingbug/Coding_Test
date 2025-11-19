import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    private static int calc(int [] arr, int idx, int n) {
        int pos = n/2;
        int dist = Math.abs(pos - idx);
        
        int start = dist;
        int end = n - 1 - dist;

        int sum = 0;
        for (int j = start; j <= end; j++) {
            sum += arr[j];
        }
        return sum;

    }
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int [][] harvest = new int[N][N];
            for(int i = 0; i < N; i++) {
                String str = sc.next();
                for(int j = 0; j < N; j++) {
                    harvest[i][j] = str.charAt(j) - '0';
                }
            }
            
            int sum = 0;
            for(int i = 0; i < N; i++) {
                sum += calc(harvest[i], i, N);
            }
            
            System.out.println("#" + test_case + " " + sum);
        }
	}
}