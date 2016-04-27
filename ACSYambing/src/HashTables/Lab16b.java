package HashTables;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;
import java.io.File;

public class Lab16b
{
public static void main ( String[] args ) throws Exception
{
		try{
			//make a new table
			
			HashTableB hashy = new HashTableB();
			
			//read from the file
			Scanner scan= new Scanner(new File("data/lab16b.dat"));
			scan.nextInt();
			while(scan.hasNext())
			{
				hashy.add(new Word(scan.next()));;
			}
			System.out.println(hashy);
			
	
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}
}
}