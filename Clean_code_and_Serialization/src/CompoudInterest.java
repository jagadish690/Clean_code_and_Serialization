
public class CompoudInterest extends SimpleInterest {
	public static double power(double a, int b)   /// a power b method
	{
		double c = 1;
		for(int i = 0; i < b; i ++)
		{
			c *= a;
		}
		return c;
	}

	public static void CompoudInterest(int principal, int rate_of_interest, int time)  {
		// TODO Auto-generated method stub
		double Compound_Interest = 0;
		double k =(1 + rate_of_interest);
		double o = power(k, time);
		Compound_Interest =(principal) * (o) - principal;
		Print(Compound_Interest);
	}

}
