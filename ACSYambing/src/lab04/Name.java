package lab04;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
name = "";

	}

	public Name(String s)
	{
name= s;

	}

 public void setName(String s)
 {
name= s;

 }

	public String getFirst()
	{
		String firstWord = null;
		if(name.contains(" ")){
		   firstWord= name.substring(0, name.indexOf(" ")); 
		}
		return firstWord;
	}

	public String getLast()
	{
		String lastWord = null;
		if(name.contains(" ")){
		   lastWord= name.substring(name.indexOf(" ")+1); 
		}
		return lastWord;
	}

	public String toString()
	{
		return name;
	}
}