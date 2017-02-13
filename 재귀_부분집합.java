
public class Solution {
	static int [] a = {10, 20, 30};
	static int [] l;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		l = new int[3];
		
		subset(0, 3);
	}
	public static void subset(int n, int k)
	{
		if(n==k)
		{
			for(int i = 0; i<k;i++)
			{
				if(l[i]==1)
					System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		else
		{
			for(int i = 0; i<=1;i++)
			{
				l[n] = i;
				subset(n+1, k);
			}
		}
	}
}
