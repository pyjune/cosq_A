import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

	public static void main(String[] args) throws Exception{
		
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int [] arr;

		for(int tc = 1; tc<=T;tc++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			arr = new int[N];
			
			for( int i = 0; i<N; i++ )
			{
				arr[i] = sc.nextInt();
			}
			int min = Integer.MAX_VALUE;
			int max = 0;
			for(int i = 0; i<= N-M; i++)
			{
				int sum = 0;
				for(int j=0; j<M; j++)
				{
					sum += arr[i+j];
				}
				if(sum<min)
					min = sum;
				if(sum>max)
					max = sum;
			}
			System.out.printf("#%d %d\n", tc, max-min);
		}
	}

}

