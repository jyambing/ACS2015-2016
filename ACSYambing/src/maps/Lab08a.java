package maps;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab08a
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("data/lab08a.dat"));

		SpanishToEnglish test = new SpanishToEnglish();
		int num= file.nextInt();
		//read in pairs from the file and load the map
		for(int x=0; x<num; x++)
			test.putEntry(file.nextLine());

		out.println("\n====\tMAP CONTENTS\t====\n\n");

		//print the map

		out.println(test+"\n\n");

		//read in the lines and convert them
		while(file.hasNext())
			String liney = file.nextLine();
			out.println(test.translate(liney));
	}
}
