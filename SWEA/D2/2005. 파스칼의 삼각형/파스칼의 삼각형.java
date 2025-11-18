import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    private static int[][] build(int n) {
    	int [][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            arr[i][0] = 1;
            for(int j = 1; j <= i; j++) {
                if(i == j) arr[i][j] = 1;
                else arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        return arr;
    }
    
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int [][] arr = build(N);
            
            System.out.println("#" + test_case);
			for(int i = 0; i < N; i++) {
            	for(int j = 0; j <= i; j++) {
            	    System.out.print(arr[i][j] + (j == i ? "" : " "));
				}	    
                System.out.println();
			}
		}
    }
}