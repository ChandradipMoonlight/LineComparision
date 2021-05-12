package linedistance;
import java.util.Scanner;

public class LineComparision {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Line comparision computation Program");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of  co-ordinate ");
		
		System.out.println("Enter the value of (x1,y1)= ");
		int x1 = sc.nextInt();
		int y1 =sc.nextInt();
		System.out.println("Enter the value of (x2,y2)= ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		double distanceLine1=Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		
		System.out.println("lenth of line1= "+ distanceLine1);
		

	}

}
