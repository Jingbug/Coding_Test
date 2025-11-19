import java.util.Scanner;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int M = sc.nextInt();
            int [] cnt = new int[N];

            for(int i = 0; i < N; i++) {
                cnt[i] = sc.nextInt();
            }
            
            int result = -1;
            for(int i = 0; i < N-1; i++) {
                int sum = 0;
                for(int j = 1; j <=N-i-1; j++) {
                    sum = cnt[i] + cnt[j+i];
                    if (sum <= M && sum > result) result = sum;
                }
            }
            
            System.out.println("#" + test_case + " " + result);
		}
	}
}