package HashTables;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class Word
{
	private String theValue;
	
	//write a constructor method
	public Word(String wordy)
	{
		theValue=wordy;
	}
	
	
	//write the getValue method
	public String getValue()
	{
		return theValue;
	}
	
	
	//write the equals method
	
	public boolean equals(Word obj)
	{
		return obj.theValue==theValue;
	}
	
	//write the hashCode method
	public int hashCode()
	{	int vowels= 0;
		for(int x=0; x<theValue.length(); x++)
			if(theValue.substring(x, x+1).equals("a")||theValue.substring(x, x+1).equals("e")||theValue.substring(x, x+1).equals("o")||theValue.substring(x, x+1).equals("i")||theValue.substring(x, x+1).equals("u"))
				vowels++;
		return (vowels*theValue.length())%10;
	}
	
	
	//write the toString method
	public String toString()
	{
		return ""+theValue;
	}
	
}