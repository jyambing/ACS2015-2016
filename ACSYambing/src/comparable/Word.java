package comparable;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String wordy ="";
	
	public Word(String word){
	wordy =word;
	}
	//add an instance variable and a constructor

	public int compareTo (Word other){
	return wordy.compareTo();
	}
	//add a compareTo

	public String toString(){
		return wordy;
	}
	//add a toString
}