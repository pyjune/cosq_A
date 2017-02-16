import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

	static int p[] = new int [1000001];
	public static void main(String[] args) throws Exception{
		
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		makeP();
		int T = sc.nextInt();
		for(int tc = 1; tc<=T;tc++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			long sum = 0;
			for(int i = a+1; i<b ; i++)
				sum += p[i];

			System.out.println("#"+tc+" "+sum);
		}
	}
	public static void makeP()
	{
		p[2] = 2;
		// 정수 채우기
		for(int i = 3; i<=1000000; i++)
		{
			if(i%2 != 0)
				p[i] = i;
		}
		// 배수 지우기
		for(int i = 2; i<1000000; i++)
		{
			for(int j = 2; j<= 1000000/i; j++)
				p[i*j] = 0;
		}
	}

}
