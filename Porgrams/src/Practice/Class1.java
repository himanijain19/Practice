package Practice;

import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println("fact is" + " " +  fact);
	}

}
