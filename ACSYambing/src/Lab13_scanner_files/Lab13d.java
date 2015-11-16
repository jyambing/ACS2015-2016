package Lab13_scanner_files;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class Lab13d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("data/lab13d.dat"));
		int size= file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{
			String statement=file.nextLine();
			DogFood df= new DogFood(statement);
			System.out.println(df);
	}
}
}