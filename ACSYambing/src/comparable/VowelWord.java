package comparable;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class VowelWord implements Comparable<VowelWord>
{
	//add a string instance variable
	private String  wordy;
	
	//add a constructor
public VowelWord(String word)
{
	wordy=word;
}
	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for(int x=0; x<wordy.length(); x++)
		{
			for(int y= 0; y<vowels.length(); y++)
			if(wordy.substring(x, x+1).indexOf(vowels.substring(y, y+1))>=0)
				vowelCount++;
		}
		return vowelCount;
	}

	public int compareTo(VowelWord other)
	{
		if(this.numVowels()>other.numVowels())
			return 1;
		if(this.numVowels()<other.numVowels())
		return -1;
		else 
			return this.wordy.compareTo(other.wordy);
	}

	public String toString()
	{
		return wordy;
	}
}