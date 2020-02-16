import java.io.*;
import java.util.Scanner;
public class Standard_Materials_cost extends Print{
	public static void Standard_Materials_cost(float Area)
	{    
		System.out.println("Requirement Credentials:\n------------------------------\n1. Super High Cost Material - 2500INR\n2. High Cost Material - 1800INR\n3.  Moderate Cost Material - 1500INR\n4.  Reasonable Low Cost Material - 1200INR ");
		System.out.println("Enter the validate Requirement Sequence No. ");
		int c;
		double k = 0;
		Scanner scan = new Scanner(System.in);
		c = scan.nextInt(); 
		if(c == 1) k = Area * 2500;
		else if(c == 2)  k = Area * 1800;
		else if(c == 3)  k = Area * 1500;
		else if(c == 4)  k = Area * 1200;
		else System.out.println("Enter Validate Requirement Sequence No.");
		System.out.print("Total Construction Cost is : ");
		Print(k);
		System.out.print("INR");
	}
}
