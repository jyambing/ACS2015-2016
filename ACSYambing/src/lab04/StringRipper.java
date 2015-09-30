package lab04;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	private String ripped;
	
	public StringRipper()
	{
word= "";
	}

	public StringRipper(String s)
	{
word= s;
	}
	
 public void setString(String s)
 {
word=s;
 }	

	public String ripString(int x, int y)
	{
		ripped = word.substring(x,y);
		return "";
	}

	public String toString()
	{
		return "\n\n" + ripped;
	}
}
