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
		String test1= "a b c d e f g h i a c d e g h i h k";
		Histogram test = new Histogram(test1);
		//read in pairs from the file and load the map
		//test.setSentence(test1);
		out.println(test);
		//print the map
		/*String test2= "1 2 3 4 5 6 1 2 3 4 5 1 3 1 2 3 4";
		Histogram t2= new Histogram(test2);
		out.println(t2);
		
		String test3= "Y U I O Q W E R T Y";
		Histogram t3= new Histogram(test3);
		out.println(t3);
		
		String test4= "4 T # @ ^ # # #";
		Histogram t4= new Histogram(test4);
		out.println(t4);*/
		
	}
}
