import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DonationsTester {

	public static void main(String[] args) throws FileNotFoundException
	{
		File inputFile = new File("Donations.txt");
		Scanner in = new Scanner(inputFile);
		Scanner sc = new Scanner (System.in);
		
		Donations giveToMe = new Donations();
		
		boolean control = false;
		System.out.print("Would you like to process donations now? (enter 'Yes' to continue):");
		
		
		String userValue = sc.next();
		if(userValue.equals("Yes") || userValue.equals("yes"))
		{
			control=true;
		}
		
		
		while(in.hasNextLine() && control==true)
		{
			String what = in.nextLine();
			String donType = "";
			double val = 0;
		
			
			if(what.startsWith("<indiv"))
			{
				donType = "Individual";
				String test = what.replaceAll("[^-0-9.]", "");
				val = Double.parseDouble(test);
			}
			else if(what.startsWith("<business"))
			{
				donType = "Business";
				String test = what.replaceAll("[^-0-9.]", "");
				val = Double.parseDouble(test);
			}
			else if(what.startsWith("<other"))
			{
				donType = "Other";
				String test = what.replaceAll("[^-0-9.]", "");
				val = Double.parseDouble(test);
			}
			
			giveToMe.processDonations(donType, val);
			
			
		
		}
		if(control==true)
			giveToMe.getStatistics();

	}

}
