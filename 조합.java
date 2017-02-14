
public class Solution {
	static int [] a={1, 2, 3, 4, 5};
	static int [] c;
	static int cnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c = new int[3];
		cnt = 0;
		nCk(5, 3, 3);
	}
	public static void nCk(int n, int k, int m)
	{
		if(k==0)
		{
			cnt++;
			for(int i = 0; i<m; i++)
				System.out.print(c[i]);
			System.out.println(" : "+cnt);
		}
		else if(n<k)
		{
			return;
		}
		else
		{
			c[k-1] = a[n-1];
			nCk(n-1, k-1, m);
			nCk(n-1, k, m);
		}
	}
}
