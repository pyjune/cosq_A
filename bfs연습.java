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

		V = sc.nextInt();
		E = sc.nextInt();
		adj = new int [V+1][V+1];
		visited = new int[V+1];
		for(int i=0; i<E; i++)
		{
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			adj[n1][n2] = 1;
			adj[n2][n1] = 1;
		}
		
		bfs(1);
		int sum = 0;
		for(int i = 2; i<=V; i++)
			sum +=visited[i];
		sum -= (V-1);
		System.out.println(sum);
	}
	public static void bfs(int s)
	{
		// 큐 생성..
		int front = -1;
		int rear = -1;
		int []q = new int[V+1];
		
		q[++rear] = s; // enQ(s)
		visited[s] = 1;
		while(front!=rear)
		{
			int n = q[++front]; // deQ()
			for(int i = 1; i<= V; i++)
			{
				if(adj[n][i]==1 && visited[i]==0)
				{
					q[++rear] = i;
					visited[i] = 1 + visited[n];
				}
			}
		}		
	}
}
