import java.util.Scanner;
import java.io.FileInputStream;

public class Solution {

	public static void main(String[] args) throws Exception{
		
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int [] count;
		int num;
		for(int tc = 1; tc<=T;tc++)
		{
			int N = sc.nextInt();
			count = new int[10];
			String card = sc.next();
			for(int i = 0; i<N; i++)
			{
				num = card.charAt(i) - '0';
	
			}
  
	
		}
	}

}
