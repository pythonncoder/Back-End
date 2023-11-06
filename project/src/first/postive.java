package first;
import java.util.Scanner;

public class postive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num= sc.nextInt();
		if (num > 0) {
			System.out.println("positive number");
		}
		else if (num < 0){
			System.out.println("negitive number");
		}
		else {
			System.out.println("Zero");
		}
		
		System.out.println("enter a string:");
		String str=sc.next();
		System.out.println(str);
		
		
	}

}
