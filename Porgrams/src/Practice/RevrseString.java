package Practice;

public class RevrseString {
	
	public static void main(String[] args) {
		
		String s="Hello I am Himani";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
			
		}
		
		System.out.println(rev);
		
	}

}
