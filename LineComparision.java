package linedistance;
import java.util.Scanner;

public class LineComparision {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Line comparision computation Program");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of  co-ordinate ");
		System.out.println("x1= ");
		int x1 = sc.nextInt();
		System.out.println("y1");
		int y1 = sc.nextInt();
		System.out.println("x2= ");
		int x2 = sc.nextInt();
		System.out.println("y2= ");
		int y2 = sc.nextInt();
		
		double distanceLine1=Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		
		System.out.println("Enter the values next co-ordinates ");
		System.out.println("x3= ");
		int x3 = sc.nextInt();
		System.out.println("y3");
		int y3 = sc.nextInt();
		System.out.println("x4= ");
		int x4 = sc.nextInt();
		System.out.println("y4= ");
		int y4 = sc.nextInt();
		
		double distanceLine2=Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));
		
		System.out.println("lenth of line1= "+ distanceLine1);
		System.out.println("Length of line 2 = "+ distanceLine2);
		
		if (distanceLine1<distanceLine2) {
			System.out.println("Line1 is less than Line2");
		} 
		else if (distanceLine1>distanceLine2) {
			System.out.println("Line1 is greater than line2");
		}
		else {
			System.out.println("Two lines are Equal");
		} 
		

	}

}
