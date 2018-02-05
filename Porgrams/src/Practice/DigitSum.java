package Practice;

import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digit,sum=0;
		while(n>0)
		{
		digit=n%10;
		n=n/10;
		sum=sum+digit;
		}
		System.out.println(sum);
	}

}
