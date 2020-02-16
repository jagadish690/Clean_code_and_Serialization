import java.io.*;
import java.util.Scanner;
public class Construction_of_House_Main extends Standard_Materials_cost{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Area of your House");
		float Area = scan.nextFloat();
		Standard_Materials_cost(Area);
	}

}
