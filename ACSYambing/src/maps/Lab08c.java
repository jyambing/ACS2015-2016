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

public class Lab08c
{
	public static void main( String args[] ) throws IOException
	{
		Relatives r= new Relatives();
		Scanner scan= new Scanner(new File("data/lab08c.dat"));
		int num= scan.nextInt();
		scan.nextLine();
		for(int i=0; i<num; i++)
		{
			r.setPersonRelative(scan.nextLine());
		}
		System.out.println(r);
		
		String s= scan.next();
		System.out.println(s+ " is related to "+ r.getRelatives(s));
	}
}
