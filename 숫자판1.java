import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int m[][];
	static int N;
	static int v[][];
	static int M;
	static int a[];
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T;tc++)
		{
			N = sc.nextInt();
			a = new int[N];
			for(int i = 0; i<N; i++)
				a[i] = sc.nextInt();
			M = sc.nextInt();
			m = new int[M][M];
			v = new int[M][M];
			for(int i=0; i<M; i++)
			{
				for(int j=0; j<M; j++)
				{
					m[i][j] = sc.nextInt();
				}
			}
			int r=0;
			for(int i = 0; i<M; i++)
			{
				for(int j = 0; j<M; j++)
				{
					if(m[i][j]==a[0])
					{
						r=find(i, j, 0);
						if(r==1)
							break;
					}
				}
				if(r==1)
					break;
			}
			System.out.println("#"+tc+" "+r);
		}
	}
	public static int find(int r, int c, int n)
	{
		//n이 값을 찾은 a배열의 인덱스..
		if(n==N-1)
		{
			return 1;
		}
		else
		{
			int dr[] = {0, 1, 0, -1};
			int dc[] = {1, 0, -1, 0};
			v[r][c] = 1;
			for(int i =0; i<4; i++)
			{
				int nr = r+dr[i];
				int nc = c+dc[i];
				if(nr>=0 && nr<M && nc>=0 && nc<M)
				{
					if(v[nr][nc]==0 && m[nr][nc]==a[n+1])
						if(find(nr, nc, n+1)==1)
							return 1;
				}
			}
			v[r][c] = 0;
			return 0;
		}
	}
}
