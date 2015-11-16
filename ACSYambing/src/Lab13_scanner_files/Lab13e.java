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

public class Lab13e
{
	public static void main( String args[] ) throws IOException{
	Scanner file = new Scanner(new File("data/lab13e.dat"));
	int size= file.nextInt();
	file.nextLine();
	for(int i=0; i<size; i++)
	{
		String statement=file.nextLine();
		Box boxy= new Box(statement);
		System.out.println(boxy);
}
}
}