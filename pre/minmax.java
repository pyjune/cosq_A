import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {
	public static void main(String[] args) throws Exception{
	
		
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int min;
		int max;
		int [] arr;
		
		for(int tc = 1; tc<=T;tc++)
		{
			int N = sc.nextInt();
			arr = new int[N];
			for(int i=0; i<N; i++)
			{
				arr[i] = sc.nextInt();
			}
			min = arr[0]; // Integer.MAX_VALUE;
			max = arr[0]; // 0
			for(int i = 1 ; i<N; i++)
			{
				if(min > arr[i])
					min = arr[i];
				if(max < arr[i])
					max = arr[i];
			}
			System.out.printf("#%d %d\n", tc, max-min);
		}
	}
}
