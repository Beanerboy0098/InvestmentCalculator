import java.util.ArrayList;

public class Investment 
{
	ArrayList<Contribution> theContributions;
	
	public Investment()
	{
		this.theContributions = new ArrayList<Contribution>();
	}
	
	void addContribution(Contribution c)
	{
		this.theContributions.add(c);
	}
	
	double getCurrentValue(int afterHowManyMonth)
	{
		double total = 0; 
	
		for ( int d = 0 ; d <= afterHowManyMonth; d++ ) {
			
			total = total * 1.0067;
			
		for(int e = 0; e < theContributions.size(); e++) {
		
		if (theContributions.get(e).monthNumber == d) {
			
			total = total + theContributions.get(e).amount;
		}
		//return the current value of this investment taking
		//time and an average 8% yearly or 0.67% monthly return
		//over afterHowManyMonths number of months
		}
		}
		return total;
	}
	
	double getTotalContributions()
	{
		double finaltotal = 0; 
		
		for (int f = 0; f < theContributions.size(); f++) {
			finaltotal = finaltotal + theContributions.get(f).amount;
		}
		return finaltotal; 
		//return the total amount ever investment not taking into
		//account interest.
	}
	
}
