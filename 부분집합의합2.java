import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int [] a;
	static int [] l;
	static int count;
	static int cnt;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			int rs = 0;
			a = new int[N];
			l = new int[N];
			count = 0;
			cnt = 0;
			for(int i = 0; i<N; i++)
			{
				a[i] = i+1;
				rs += a[i];
			}
			
			//subset_sum(0, N, K);
			subset_sum2(0, N, K, 0, rs);
			System.out.println("#"+tc+" "+count+" : "+cnt);
		}
		
	}
	public static void subset_sum2(int n, int k, int ts, int s, int rs)
	{
		if(s+rs<ts)
		{
			return;
		}
		else if(s==ts)
		{
			count++;
			if(n==k)
				cnt++;
		}
		else if(n==k)
		{
			cnt++;
			return;
		}
		else if(s>ts)
		{
			return;
		}
		else
		{
			l[n] = 0;
			subset_sum2(n+1, k, ts, s, rs-a[n]);
			l[n] = 1;
			subset_sum2(n+1, k, ts, s+a[n], rs-a[n]);
		}
	}

	public static void subset_sum(int n, int k, int S )
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
