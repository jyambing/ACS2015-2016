package comparable;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06b
{
	public static void main( String args[] ) throws IOException
	{
		ArrayList<VowelWord> words= new ArrayList<VowelWord>();
		Scanner file = new Scanner(new File ("data/lab06b.dat"));
		while(file.hasNext())
		{
			words.add(new VowelWord (file.next()));
		}
		
		Collections.sort(words);
		for(VowelWord word: words)
		{
			System.out.println(word);
		}

	
		//add test cases
	}
}