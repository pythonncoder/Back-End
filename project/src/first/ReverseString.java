package first;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

//		Scanner Sc = new Scanner(System.in);
//		System.out.println("Enter the String:");
//		String str = Sc.nextLine();
		String str = "naveen ";
		String ch = " ";
		
		
		ReverseString s = new ReverseString();
	
		int len = str.length();
		
		for (int i=len-1; i>=0;i--) {
		System.out.print(str.charAt(i));	 
			
	}
		
	}
}