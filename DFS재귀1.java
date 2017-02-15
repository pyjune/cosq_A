import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	static int [][] adj;
	static int V;
	static int E;
	static int [] visited;
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
			for(int i=0; i<E; i++)
			{
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				adj[n1][n2] = 1;
				//adj[n2][n1] = 1;// 무향인 경우..
			}
			DFS(1);
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
