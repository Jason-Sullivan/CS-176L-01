
public class ArrayAssignment1 {

	public static void main(String[] args) 
	{
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double largest = values[0];
		int negativeCounter=0;
		
		for(double element : values)
		{
			System.out.print(element+" ");
		}
		
		for(double element : values)
		{
			if(element>largest)
			{
				largest = element;
			}
		}
		System.out.println("\nThe largest element in the array is "+largest);
	
		for(double element : values)
		{
			if(element<0)
				negativeCounter++;
		}
		System.out.println("There are "+ negativeCounter+" numbers in the array");
	}
		

}
