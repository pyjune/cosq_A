import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int [][] arr;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<= T ; tc++)
		{
			int N = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			arr = new int[N][N];
			for(int i = 0; i<N; i++)
			{
				for(int j=0; j<N; j++)
				{
					arr[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			//int min = Integer.MAX_VALUE; // int min = 10000000;
			for(int i = 0; i<=N-n; i++)
			{
				for(int j=0;j<=N-m; j++)
				{
					// 부분 배열의 합...
					int sum = 0;
					for(int r=0; r<n; r++)
					{
						for(int c=0; c<m; c++)
						{
							sum += arr[i+r][j+c];
						}
					}
					// 이전의 max와 비교..
					if(max<sum)
						max = sum;
				}
			}
			System.out.println("#"+tc+" "+max);
			// System.out.printf("#%d %d\n", tc, max);
		}
	}

}
