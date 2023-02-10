
public class Microwave 
{
	private int timeValue = 0; 
	private int powerLevel = 1;
	
	//changes the power level "switch" and prints out that the power button was pressed
	public void power()
	{
		if (powerLevel == 1)
		{
			powerLevel = 2;
		}
		else
		{
			powerLevel = 1;
		}
		
		System.out.println("Power Button was pressed. Power level is " +powerLevel);
	}
	
	//adds 30 seconds to the time and prints out the new time
	public void time()
	{
		timeValue = timeValue+30;
		
		System.out.println("Time Button was pressed. Time is "+ timeValue +" seconds");
	}
	
	//resets the time to 0 and power level to 1 and prints out the changes
	public void reset()
	{
		timeValue = 0;
		powerLevel = 1;
		
		System.out.println("Reset Button was pressed. Power level is " +powerLevel+ ". Time is " +timeValue+ " seconds.");
	}
	
	//displays a starting message to "start" the microwave
	public void start()
	{
		System.out.println("Cooking for " +timeValue+ " seconds at level " +powerLevel+ ".");
	}
		
}
