import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int [] a;
	static int min;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++)
		{
			int N = sc.nextInt();
			a = new int[N];
			for(int i = 1; i<N; i++)
			{
				a[i] = sc.nextInt();
			}
			min = N;
			//f(1, N, 0, 0);
			//min--;// 기점에서의 교체횟수 제외..
			//System.out.println("#"+tc+" "+min);
			
			//f(1, N, 0, -1);
			//System.out.println("#"+tc+" "+min);
			
			f(2, N, a[1]-1, 0);
			System.out.println("#"+tc+" "+min);
		}	
	}
	public static void f(int n, int k, int e, int c)
	{
		if(n==k)
		{
			if(min>c)
				min = c;
		}
		else
		{
			// 교체
			f(n+1, k, a[n]-1, c+1);
			// 통과
			if(e>0)
				f(n+1, k, e-1, c);
		}
	}
}
