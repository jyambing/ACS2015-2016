package lab04;
import static java.lang.System.*;

	public class NamesGenerator {

	private String finalName;
	private String first;
	private String last;
	
	
	public NamesGenerator(String name)
{ Name profile= new Name(name);
		first= profile.getFirst();
        last= profile.getLast(); 
        name= last + first;
		finalName= name;
}
	public void firstQuestion (String color)
	{ 
		if(color.equals("Red") || color.equals("Orange")||color.equals("Yellow") ||color.equals("Green"))
				finalName= "Warm "+ finalName;
		else finalName= "Icy " + finalName; 
	}

	public void secondQuestion (String sport)
	{ if(sport.contains("ball"))
			{
			finalName= finalName+ " Baller";
			}
	else finalName= finalName + " Varsity Bound";
	}
		 	public String toString()
		 	{
		 		return finalName; 
		 	}


}