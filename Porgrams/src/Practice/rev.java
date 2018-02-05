package Practice;

import java.util.Scanner;

public class rev {
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		System.out.print(sb.reverse());
	}

}
