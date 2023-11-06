// pentagon formula 
package first;
import java.util.*;


public class pentagon {
	
	public static double pentagons(int s,int a) {
		
		 double sum = 0 ;
		
		return  sum =  (5.0*2.0) * s * a ;
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int s = sc.nextInt();
		System.out.print("enter the second number:");
		int a = sc.nextInt();
		
		 
		 
		System.out.print(pentagons(s,a));
		
		
	}

}
