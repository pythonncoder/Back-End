package first;
import java.util.Scanner;

public class swap_2_num {
	 static int t = 0;
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first num:");
		int a = sc.nextInt();
		System.out.println("enter the second num:");
		int b= sc.nextInt();
		
		t=a;
		a=b;
		b=t;
		
		System.out.println("a =" + " "+a);
		System.out.println("b ="+ " "+b);
		
		
		
		
	}

}
