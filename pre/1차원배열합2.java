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
			// 반복을 줄이는 방법
			int sum =0;
			for(int i = 0; i<M; i++)
			{
				sum += arr[i];
			}
			int min = sum;
			int max = sum;
			for(int i=0; i<N-M; i++)
			{
				sum = sum - arr[i] + arr[i+M];
				if(sum > max)
					max = sum;
				if(sum < min)
					min = sum;
			}
			
			
			System.out.printf("#%d %d\n", tc, max-min);
		}
	}

}

