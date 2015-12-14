package arraylist;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordRunner
{
	public static void main(String[] args)
	{
		Word one = new Word("chicken"); 
			out.println(one);
			out.println("num vowels== "+one.getNumVowels());
			out.println("num chars== "+one.getLength());
			
			Word two = new Word("alligator"); 
			out.println(two);
			out.println("num vowels== "+two.getNumVowels());
			out.println("num chars== "+two.getLength());
			
			Word three = new Word("elephant"); 
			out.println(three);
			out.println("num vowels== "+three.getNumVowels());
			out.println("num chars== "+three.getLength());
		}
	}
