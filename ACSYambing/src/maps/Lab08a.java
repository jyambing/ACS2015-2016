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
		Scanner scan = new Scanner(new File("data/lab08a.dat"));

		SpanishToEnglish test = new SpanishToEnglish();
		int num= scan.nextInt();
		//read in pairs from the file and load the map
		scan.nextLine();
		for(int x=0; x<num; x++)
			test.putEntry(scan.nextLine());

		out.println("\n====\tMAP CONTENTS\t====\n\n");

		//print the map

		out.println(test+"\n\n");
		//read in the lines and convert them
		while(scan.hasNext())
			System.out.println(test.translate(scan.nextLine()));
	}
}
