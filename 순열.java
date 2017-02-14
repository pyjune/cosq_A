
public class Solution {
	static int [] p;
	static int [] used;
	static int [] a = {1,2,3};
public class Solution {
	static int [] p;
	static int [] used;
	static int [] a = {1,2,3,4,5};
	static int count;
	public static void main(String[] args) {
		p = new int[3];
		used = new int[5];
		
		//perm(0, 3);
		count =0;
		perm2(0, 3, 5);

	}
	public static void perm2(int n, int k, int m)
	{
		if(n==k)
		{
			count++;
			for(int i = 0 ; i<k; i++)
				System.out.print(p[i]);
			System.out.println(" : "+count);
		}
		else
		{
			for(int i = 0; i<m; i++)
			{
				if(used[i]==0)
				{
					used[i] = 1;
					p[n] = a[i];
					perm2(n+1, k, m);
					used[i] = 0;
				}
			}
		}
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
