package first;

import java.util.Scanner;

public class reverse {
	
	
	
	
	public  static int num_reverse(int num){
		
		int rev = 0;
		while (num != 0) {
			rev = rev *10 + num % 10;
			num = num / 10;	
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 digit number:");
		int num = sc.nextInt();
		System.out.println("Enter a string:");
		String str= sc.next();
		
		
		reverse rev1 = new reverse();
		
		System.out.println(rev1.num_reverse(num));
		
		
		
		
		
		
	}

}