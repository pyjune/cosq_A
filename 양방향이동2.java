import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int N;
	static int M;
	static int [][] map;
	static int min;
	static int cnt;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T;tc++)
		{
			N = sc.nextInt();
			M = sc.nextInt();
			map = new int[N][M];
			min = Integer.MAX_VALUE;
			cnt = 0;
			for(int i = 0; i<N; i++)
				for(int j = 0; j<M; j++)
					map[i][j] = sc.nextInt();
			find(0, 0, 0);
			System.out.println("#"+tc+" "+min+" "+cnt);
					
		}
	}
	public static void find(int r, int c, int s)
	{
		int [] dr = {0, 1};
		int [] dc = {1, 0};
		if((r==N-1)&&(c==M-1)) // 도착지..
		{
			cnt++;
			if(s+map[r][c]<min)
				min = s+map[r][c];
		}
		else if(s+map[r][c] >=min)
			return;
		else
		{
			for(int i = 0 ; i<2; i++)
			{
				int nr = r+dr[i];
				int nc = c+dc[i];
				if(nr<N && nc<M)
				{
					find(nr, nc, s+map[r][c]);
				}
			}
		}
	}
}
