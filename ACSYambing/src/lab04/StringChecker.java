package lab04;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
word= "";

	}

	public StringChecker(String s)
	{

word= s; 
	}

 public void setString(String s)
 {
 	word=s;
 }

	public boolean findLetter(String c)
	{
if(word.contains(c))
	return true;
else return false;
	}

	public boolean findSubString(String s)
	{
if(word.contains(s))
	return true;
else return false;
	}

	public String toString()
	{
		return word;
	}
}