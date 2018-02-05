package Practice;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		System.out.println("Enter the no ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter no of times");
		Scanner st=new Scanner(System.in);
		int y=st.nextInt();
		int pow=1;
		for(int i=1;i<=y;i++)
		{
			pow=pow*x;
		}
		System.out.println(pow);
		
		
	}

}
