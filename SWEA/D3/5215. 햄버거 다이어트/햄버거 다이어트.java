import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int N, L;
    static int [] score, cal;
    static int maxScore;
    
    private static void dfs(int idx, int totalCal, int totalScore) {
        if (totalCal > L) return;
        
        if (idx == N) {
            maxScore = Math.max(totalScore, maxScore);
            return;
        }
        
        dfs(idx+1, totalCal + cal[idx], totalScore + score[idx]);
        dfs(idx+1, totalCal, totalScore);
    }
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            N = sc.nextInt();
            L = sc.nextInt();
            
            score = new int[N];
            cal = new int[N];
            
            for(int i = 0; i < N; i++) {
                score[i] = sc.nextInt();	// 점수
                cal[i] = sc.nextInt();	// 칼로리
            }
            maxScore = 0;
            dfs(0, 0, 0);
            
            System.out.println("#" + test_case + " " + maxScore);
		}
	}
}