import java.util.*;

public class ArrayList_Sorts 
{
	public boolean hasName(ArrayList<String> list, String name)
	{
		for(int i = 0; i<100; i++)
		 {
			 if(list.get(i).equals(name))
			 {
				 return true;
			 }
		 }
		return false;
	}
	
	public int position(ArrayList<String> list, String name)
	{
		for(int i = 0; i<100; i++)
		 {
			 if(list.get(i).equals(name))
			 {
				 return i;
			 }
		 }
		return 0;
	}
}
