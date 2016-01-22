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

public class Lab08b
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		Scanner scan = new Scanner(new File(""));
		while(scan.nextLine())
		Histogram test = new Histogram(scan.nextLine());
		//read in pairs from the file and load the map

		out.println("char    1---5----01---5");
		out.println(test);
		//print the map

		

	}
}
