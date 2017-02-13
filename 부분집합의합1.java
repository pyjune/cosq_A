import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int [] a;
	static int [] l;
	static int count;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			a = new int[N];
			l = new int[N];
			count = 0;
			for(int i = 0; i<N; i++)
			{
				a[i] = i+1;
			}
			
			subset_sum(0, N, K);
			System.out.println("#"+tc+" "+count);
		}
		
	}
	public static void subset_sum(int n, int k, int S)
	{
		if(n==k) // 부분집합 완성...
		{
			int sum = 0;
			for(int i = 0; i<k; i++)
			{
				if(l[i]==1)
				{
					sum += a[i];
				}
			}
			if(sum == S)
			{
				count++;
			}
		}
		else
		{
			l[n] = 0;
			subset_sum(n+1, k, S);
			l[n] = 1;
			subset_sum(n+1, k, S);
		}
	}

}
