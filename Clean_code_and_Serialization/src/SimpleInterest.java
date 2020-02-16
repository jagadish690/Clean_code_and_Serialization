
public class SimpleInterest extends Print{

	public static void SimpleInterest(int principal, int rate_of_interest, int time) {
		// TODO Auto-generated method stub
		int Simple_Interest = 0;
		Simple_Interest = (principal * time * rate_of_interest) / 100;
		Print(Simple_Interest);
		
	}

}
