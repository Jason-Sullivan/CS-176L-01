import java.io.IOException;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.text.*;


public class Fangraph {

	public static void main(String[] args) throws IOException
	{
		DecimalFormat df = new DecimalFormat("0.00");
		
		Document doc1 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&page=1_50")
				 .timeout(6000).get();
		 
		 Elements body = doc1.select("tbody");
		 int counter = 0;
		 
		 //List for 2022 players
		 ArrayList<String> twoTwo = new ArrayList<String>();
		 
		 for(Element e : body.select("td.grid_line_regular"))
		 {
			 String name = e.select("a").text();
			 if(name!="" && name.length()>3)
			 {
				 counter++;
				 //System.out.println(counter + ": "+name);
				 twoTwo.add(name);
			 }
		 }
		 
		 Document doc2 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0&page=2_50")
				 .timeout(6000).get();		 
		 Elements body2 = doc2.select("tbody");
		 
		 for(Element e : body2.select("td.grid_line_regular"))
		 {
			 String name = e.select("a").text();
			 if(name!="" && name.length()>3)
			 {
				 counter++;
				 //System.out.println(counter + ": "+name);
				 twoTwo.add(name);
				 
			 }
		 }
		 
		 
		 //list for 2021 players
		 ArrayList<String> twoOne= new ArrayList<String>(); 
		 counter = 0;
		 
		 Document doc3 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&page=1_50")
				 .timeout(6000).get();		 
		 Elements body3 = doc3.select("tbody");
		 
		 for(Element e : body3.select("td.grid_line_regular"))
		 {
			 String name = e.select("a").text();
			 if(name!="" && name.length()>3)
			 {
				 counter++;
				 //System.out.println(counter + ": "+name);
				 twoOne.add(name);
				 
			 }
		 }
		 
		 Document doc4 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0&page=2_50")
				 .timeout(6000).get();		 
		 Elements body4 = doc4.select("tbody");
		 
		 for(Element e : body4.select("td.grid_line_regular"))
		 {
			 String name = e.select("a").text();
			 if(name!="" && name.length()>3)
			 {
				 counter++;
				 //System.out.println(counter + ": "+name);
				 twoOne.add(name);
				 
			 }
		 }
		 
		 
		//list for 2020 players
		 ArrayList<String> twenty= new ArrayList<String>(); 
		 counter = 0;
		 
		 Document doc5 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0&page=1_50")
				 .timeout(6000).get();		 
		 Elements body5 = doc5.select("tbody");
		 
		 for(Element e : body5.select("td.grid_line_regular"))
		 {
			 String name = e.select("a").text();
			 if(name!="" && name.length()>3)
			 {
				 counter++;
				 //System.out.println(counter + ": "+name);
				 twenty.add(name);
				 
			 }
		 }
		 
		 Document doc6 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0&page=2_50")
				 .timeout(6000).get();		 
		 Elements body6 = doc6.select("tbody");
		 
		 for(Element e : body6.select("td.grid_line_regular"))
		 {
			 String name = e.select("a").text();
			 if(name!="" && name.length()>3)
			 {
				 counter++;
				 //System.out.println(counter + ": "+name);
				 twenty.add(name);
				 
			 }
		 }
		 
		 ArrayList <String> finalList = new ArrayList<String>();
		 ArrayList <Double> finalRanks = new ArrayList<Double>();
		 
		 
		 ArrayList_Sorts testMethods = new ArrayList_Sorts();
		 for(int i = 0; i<twoTwo.size(); i++)
		 {
			 if(testMethods.hasName(twoOne, twoTwo.get(i)) && testMethods.hasName(twenty, twoTwo.get(i)))
			 {
				 finalList.add(twoTwo.get(i));
				 double total = ((double)i+testMethods.position(twoOne, twoTwo.get(i))+testMethods.position(twenty, twoTwo.get(i)))/3;
				 finalRanks.add(total);
				 
				 
				 
			 }
		 }

		 for(int i=0; i<finalList.size(); i++)
		 {
			for(int j=i; j<finalList.size(); j++)
			{
				if(finalRanks.get(j)<finalRanks.get(i))
				{
					Collections.swap(finalRanks, j, i);
					Collections.swap(finalList, j, i);
					
				}
			}
		 }
		 
		 for(int i=0; i<10; i++)
		 {
			 System.out.println((i+1)+": "+finalList.get(i)+", average: "+df.format(finalRanks.get(i)));
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
