import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int m[][];
	static int row;
	static int col;
	static int min;
	static int cnt;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T;tc++)
		{
			row = sc.nextInt();
			col = sc.nextInt();
			m = new int[row][col];
			min = Integer.MAX_VALUE;
			cnt = 0;
			for(int i = 0; i<row; i++)
			{
				for(int j = 0; j<col; j++)
				{
					m[i][j] = sc.nextInt();
				}
			}
			find(0, 0, 0);
			System.out.println("#"+tc+" "+min+" : "+cnt);
		}
	}
	public static void find(int r, int c, int s)
	{
		cnt++;
		if((r==row-1)&&(c==col-1))
		{
			if(s+m[r][c]<min)
				min = s+m[r][c];
		}
		else if(s+m[r][c]>min)
			return;
		else
		{
			//if(c+1<col && m[r][c+1]!=0)// 0인 칸에 진입할 수 없는 조건인 경우
			if(c+1<col)
				find(r, c+1, s+m[r][c]);
			//if(r+1<row && m[r+1][c]!=0)
			if(r+1<row)
				find(r+1, c, s+m[r][c]);
		}
	}
}
