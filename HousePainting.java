import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in); //creates new scanner
		
		
	
		//reading in all of the inputs from the user
		System.out.print("Please enter the cost per square foot: ");// cost per square foot
		double painterCostPerSqrFoot = sc.nextDouble(); 
		
		System.out.print("Please enter the length of the house: "); // house length
		double houseLength = sc.nextDouble();

		System.out.print("Please enter the width of the house: "); // house width
		double houseWidth = sc.nextDouble();
		
		System.out.print("Please enter the height of the house: "); // house height
		double houseHeight = sc.nextDouble();
		
		System.out.print("Please enter the number of windows: "); // number of windows
		double numOfWindows = sc.nextDouble();
		
		System.out.print("Please enter the length of a window: "); // length of windows
		double windowLength = sc.nextDouble();
		
		System.out.print("Please enter the width of a window: "); // width of windows
		double windowWidth = sc.nextDouble();
		
		System.out.print("Please enter the number of doors: "); // number of doors
		double numOfDoors = sc.nextDouble();
		
		System.out.print("Please enter the length of a door: "); // length of doors
		double doorLength = sc.nextDouble();
		
		System.out.print("Please enter the width of a door: "); // width of doors
		double doorWidth = sc.nextDouble();
		
		
		//calculations
		double peakSide = houseWidth * houseLength + (0.5 * (houseLength * (houseHeight - houseWidth))); // calculates the area of peak side of the house
		double normalSide = houseWidth * houseLength; // calculates the area of the normal side of the house
		double totalHouseSize = (2 * peakSide) + (2 * normalSide); // calculates the total area of the house
		
		double windowArea = windowLength * windowWidth; //windows area
		double doorArea = doorLength * doorWidth; //doors area
		
		double paintableArea = totalHouseSize -((windowArea * numOfWindows) + (doorArea * numOfDoors)); // total piantable area of the house
		double totalCost = paintableArea * painterCostPerSqrFoot; // total cost to paint everything

		
		//Output
		System.out.println("The total paintable surface area is " + Math.round(paintableArea) + " square feet."); // prints the total paintable surface area
		System.out.println("Your estimate is " + Math.round(totalCost) + " dollars."); // prints the total cost
		
		
	}

}
