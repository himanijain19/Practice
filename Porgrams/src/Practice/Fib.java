package Practice;

import java.util.Scanner;

public class Fib {
	public static void main(String[] args) {
		
		System.out.println("Enter the length of fib series");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.print(a);
		System.out.print(b);
		for(int i=2;i<=n;i++)
		{
			int c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
	
	}

}
