import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {
	   boolean test = false;
	   Scanner in = new Scanner(System.in);
	   Scanner scnr;
	   System.out.println("Please enter the path to open the input file:");
	   
	   
	   
	   String input = in.nextLine();
	   
	   
	   
     // File inputFile = new File("C:\\Users\\geckert\\Downloads\\e02\\student\\lines.txt");
     // PrintWriter outputFile = new PrintWriter("C:\\Users\\geckert\\Downloads\\e02\\student\\outlines.txt");
    
	PrintWriter outputFile = new PrintWriter("outlines.txt");
	
	while(test == false) 
	{
		
	
		try 
		{
			File file = new File(input);
			scnr = new Scanner(file);
    	 
			while (scnr.hasNext()) 
			{
				String what =scnr.next();
				outputFile.println(what);
				System.out.println(what);
			}
			scnr.close();
			outputFile.close();
			
         
			test = true;
			break;
		}
		catch(Exception ex)
		{
			System.out.println("File not found, please enter a new file: ");
    	 
		}
		
		input = in.nextLine();
		
	}
     
	   
	   
      
   }
   /*
   File inputFile = new File("C:\\Users\\geckert\\Downloads\\e02\\student\\lines.txt");
   PrintWriter outputFile = new PrintWriter("C:\\Users\\geckert\\Downloads\\e02\\student\\outlines.txt");
  
   Scanner in = new Scanner(inputFile);
   while (in.hasNext()) 
   {
   String what =in.next();
   outputFile.println(what);
   }
   in.close();
   outputFile.close();
   */
}
