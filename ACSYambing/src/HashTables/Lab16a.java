package HashTables;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class Lab16a
{
public static void main ( String[] args )
{
		try{
			//make a new table
			HashTable hashy = new HashTable();
			
			//read from the file
			Scanner scan= new Scanner(new File("data/lab16a.dat"));
			
			while( scan.hasNext())
			{
				hashy.add(new Number(scan.nextInt()));;
			}
			System.out.println(hashy);
			
			//load stuff into the table
			
			//print out the table
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}
}
}
