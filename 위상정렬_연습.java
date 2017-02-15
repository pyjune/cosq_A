// 동전이 가장 적은 사람들은 1개씩 갖고 있다..
// V E
// 1<2, 1<3, 3<2, .....
// 6 7
// 1 2 1 3 3 2 6 3 3 4 5 4 2 5
//

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int V; 
	static int E;
	static int adj[][];
	static int coin[];
	static int ind[];
	public static void main(String args[]) throws Exception	{
		
		Scanner sc = new Scanner(new FileInputStream("input.txt"));
        //Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		adj = new int[V+1][V+1];
		coin = new int[V+1];
		ind = new int[V+1];
		for(int i = 0; i< E; i++)
		{
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			adj[n1][n2] = 1; // 
			ind[n2]++; // 진입차수 계산
		}
		coin[1] = 1;
		coin[V] = 1;
		int r = tps();
		System.out.println(r);
	}
	public static int tps()
	{
		int max = 0;
		Queue <Integer> q = new LinkedList<>();
		for(int i=1; i<=V; i++)
		{
			if(ind[i]==0)
			{
				q.add(i);
				coin[i] = 1;
			}
		}
		while(!q.isEmpty())
		{
			int n = q.poll();
			for(int i = 1;i<=V; i++)
			{
				if(adj[n][i]==1)
				{
					ind[i]--;
					if(ind[i]==0)
					{
						q.add(i);
						coin[i] = coin[n]+1;
						if(max<coin[i])
							max = coin[i];
					}
				}
			}
		}
		return max;
	}
}
