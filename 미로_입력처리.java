import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int [][] map;
	static int N; // 미로의 크기

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T;tc++)
		{
			N = sc.nextInt();
			map = new int [N][N];
			int str = 0;
			int stc = 0;
			for(int i=0; i<N; i++)
			{
				String st = sc.next();
				for(int j = 0; j<N; j++)
				{
					map[i][j] = st.charAt(j)-'0';
					if(map[i][j]==2)
					{
						str = i;
						stc = j;
					}
				}
			}
			int r = find(str, stc);
			System.out.println("#"+tc+" "+r);

		}
	}
	public static int find(int r, int c)
	{
		if(map[r][c]==3)
		{
			return 1;
		}
		else
		{			
return 0;
		}
	}
	
}
