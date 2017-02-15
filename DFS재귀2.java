import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int [][] adj;
	static int V;
	static int E;
	static int [] visited;
	static int count; // dfs2()
	static int min; // dfs3()
	public static void main(String[] args) throws Exception{
		
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++)
		{
			V = sc.nextInt();
			E = sc.nextInt();
			adj = new int[V+1][V+1];
			visited = new int[V+1];
			count = 0;
			min = Integer.MAX_VALUE;
			for(int i=0; i<E; i++)
			{
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				adj[n1][n2] = 1;
				//adj[n2][n1] = 1;// 무향인 경우..
			}
			//DFS(1);
			//DFS2(1, 4);
			//System.out.println(count);
			DFS3(1, 4, 0);
			System.out.println(min);
		}
	}
	// 최단 거리...(지나간 간선 수..)
	public static void DFS3(int n, int k, int e)
	{
		if(n==k)// 목적지 도착..
		{
			if(min>e)
				min=e;
		}
		else
		{
			visited[n] = 1;
			//System.out.print(n + " ");
			for(int i = 1; i<=V; i++)
			{
				if(adj[n][i]==1 && visited[i]==0)
				{
					DFS3(i, k, e+1);
				}
			}
			visited[n] = 0;
		}
	}
	// 경로의 수 찾기...
	public static void DFS2(int n, int k)
	{
		if(n==k)// 목적지 도착..
		{
			count++;
		}
		else
		{
			visited[n] = 1;
			//System.out.print(n + " ");
			for(int i = 1; i<=V; i++)
			{
				if(adj[n][i]==1 && visited[i]==0)
				{
					DFS2(i, k);
				}
			}
			visited[n] = 0;
		}
	}
	public static void DFS(int n)
	{
		visited[n] = 1;
		System.out.print(n + " ");
		for(int i = 1; i<=V; i++)
		{
			if(adj[n][i]==1 && visited[i]==0)
			{
				DFS(i);
			}
		}
	}
}
