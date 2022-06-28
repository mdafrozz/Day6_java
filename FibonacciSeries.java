package logical_programs;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		fabonacciNums(sc.nextInt());
	}
	
	static void fabonacciNums(int n)
	{
		int a = 0;
		int b = 1;
		System.out.print("The Fibonacci Series is: ");
		if(n >= 1)
			System.out.print("0 ");
		if(n >= 2)
			System.out.print("1 ");
		
		for(int i = 3; i <= n; i++)
		{
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}
