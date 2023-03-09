import java.util.ArrayList;
import java.util.List;

public class Medals 
{
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> totalArray = new ArrayList(); 
		
		//creates the countryList arraylist and adds the countries
		ArrayList<String> countryList = new ArrayList();
		countryList.add("Canada");
		countryList.add("Italy");
		countryList.add("Germany");
		countryList.add("Japan");
		countryList.add("Kazakhstan");
		countryList.add("Russia");
		countryList.add("South Korea");
		countryList.add("United States");
		
		ArrayList<Integer> goldList = new ArrayList<>(List.of(0, 0, 0, 1, 0, 3, 0, 1, 5));	
		ArrayList<Integer> silverList = new ArrayList<>(List.of(3, 0, 0, 0, 0, 1, 1, 0, 5));		
		ArrayList<Integer> bronzeList = new ArrayList<>(List.of(0, 1, 1, 0, 1, 1, 0, 1, 5));		

		//System.out.println("Country		Gold	 Silver	   Bronze	 Total");
		System.out.format("%-13s %10s %10s %10s %10s", "Country", "Gold", "Silver", "Bronze", "Total\n");
		
		totalArray.add(goldList);
		totalArray.add(silverList);
		totalArray.add(bronzeList);
		
		
		int goldTotal = 0;
		int silverTotal=0;
		int bronzeTotal=0;
		for(int i=0; i<countryList.size(); i++)
		{
			//System.out.print(countryList.get(i)+"\t\t");
			System.out.format("%-13s", countryList.get(i));
			
			int countryTotal=0;
			for(int j=0; j<totalArray.size(); j++)
			{
				countryTotal= (totalArray.get(j).get(i))+countryTotal;
				//System.out.print(totalArray.get(j).get(i)+"\t");
				System.out.format("%11s", totalArray.get(j).get(i));
				
				if(j==0)
				{
					goldTotal+=totalArray.get(j).get(i);
				}
				else if(j==1)
				{
					silverTotal+=totalArray.get(j).get(i);
				}
				else
				{
					bronzeTotal+=totalArray.get(j).get(i);
				}
			}
			//System.out.println();
			//System.out.println(countryTotal);
			System.out.format("%11s", countryTotal+"\n");
		}
		
		//System.out.println("Totals	\t"+goldTotal+"\t"+silverTotal+"\t"+bronzeTotal+"\t"+(goldTotal+silverTotal+bronzeTotal));
		System.out.format("%-13s %10s %10s %10s %10s","Totals", goldTotal, silverTotal, bronzeTotal, (goldTotal+silverTotal+bronzeTotal)+"\n");
	}
}
