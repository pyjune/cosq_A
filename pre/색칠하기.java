import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int [][] m;
	static int cnt;
	public static void main(String[] args) throws Exception{
		
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();

		for(int tc = 1; tc<=T;tc++)
		{
			int N = sc.nextInt();
			m = new int[10][10];
			cnt = 0;
			for(int i = 0; i<N; i++)
			{
				int r1 = sc.nextInt();
				int c1 = sc.nextInt();
				int r2 = sc.nextInt();
				int c2 = sc.nextInt();
				int color = sc.nextInt();
				draw(r1, c1, r2, c2, color);
			}
			System.out.println("#"+tc+" "+cnt);
		}
	}
	public static void draw(int r1, int c1, int r2, int c2, int color)
	{
		for(int i = r1; i<=r2; i++)
		{
			for(int j = c1; j<= c2; j++)
			{
				if(m[i][j]==0)
				{
					m[i][j] = color;
				}
				else if (m[i][j]!=color)
				{
					m[i][j] += color;
					cnt++;
				}
			}
		}
	}

}

