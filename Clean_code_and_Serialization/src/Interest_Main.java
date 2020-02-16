import java.io.*;
import java.util.*;
public class Interest_Main extends CompoudInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the Principal Amount, Rate Of Interest, Time Duration ");
		int principal = scan.nextInt();          // main amount //
		int rate_of_interest = scan.nextInt();   // annual years percent //
		int time = scan.nextInt();               // Time duration of interest //
		System.out.println(" Simple Interest Value for the given details be ");
		SimpleInterest(principal, rate_of_interest, time);
		System.out.println(" Compound Interest Value for the given details be ");
	    CompoudInterest(principal, rate_of_interest, time);
       	}
}
