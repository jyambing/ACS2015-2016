package Lab13_scanner_files;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab13a
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab13a.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i < size; i++)
		{
		   int num = file.nextInt();

			//instantiate an OddOrEven



		}
	}
}