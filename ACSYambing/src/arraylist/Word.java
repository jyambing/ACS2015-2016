package arraylist;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
 private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
word="";
	}

	public Word(String wrd)
	{
word=wrd;
	}

	public void setWord(String wrd)
	{
word=wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
for(int x=0; x<word.length()-1; x++){
	for(int j=0; j<vowels.length()-1; j++ )
	{
		if(word.substring(x,x+1).equals(vowels.substring(j, j+1)))
			count++;
	}
}


		return count;
	}
	
	public int getLength()
	{
	return word.length();
	}

	public String toString()
	{
	   return word;
	}
}