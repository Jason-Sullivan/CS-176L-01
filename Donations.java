
public class Donations {
	int numIndividual;
	double amtIndividual;
	int numBusiness ;
	double amtBusiness;
	int numOther;
	double amtOther;
	
	
	public void processDonations(String cat, double donation)
	{
		if(cat.equals("Individual"))
		{
			if(donation>0)
			{
				numIndividual += 1;
				amtIndividual += donation;
			}
			else
			{
				numIndividual -=1;
				amtIndividual += donation;
			}
		}
		
		else if(cat.equals("Business"))
		{
			if(donation>0)
			{
				numBusiness += 1;
				amtBusiness += donation;
			}
			else
			{
				numBusiness -=1;
				amtBusiness += donation;
			}
		}
		
		else if(cat.equals("Other"))
		{
			if(donation>0)
			{
				numOther += 1;
				amtOther += donation;
			}
			else
			{
				numOther -=1;
				amtOther += donation;
			}
		}
	}
	
	public void getStatistics()
	{
		System.out.println("Individual: #:"+ numIndividual+ " $" + amtIndividual);
		System.out.println("Business: #:"+ numBusiness+ " $" + amtBusiness);
		System.out.println("Other: #:"+ numOther+ " $" + amtOther);
		
		
	}

}
