
public class Solution {
	static int [] p;
	static int [] used;
	static int [] a = {1,2,3};
	public static void main(String[] args) {
		p = new int[3];
		used = new int[3];
		
		perm(0, 3);

	}
	public static void perm(int n, int k)
	{
		if(n==k)
		{
			for(int i = 0 ; i<k; i++)
				System.out.print(p[i]);
			System.out.println();
		}
		else
		{
			for(int i = 0; i<k; i++)
			{
				if(used[i]==0)
				{
					used[i] = 1;
					p[n] = a[i];
					perm(n+1, k);
					used[i] = 0;
				}
			}
		}
	}
}
