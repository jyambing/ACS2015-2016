package sets;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab07b
{
	public static void main( String args[] ) throws IOException
	{
		//more test cases
				String list= "1 5 9 4 6 8 12";
				OddEvenSets one= new OddEvenSets(list);
				System.out.println(one);
				
				String list1= "3 5 7 17 29 4 6 56 72";
				OddEvenSets two= new OddEvenSets(list1);
				System.out.println(two);
				
				String list2= "3 6 12 2 28 6";
				OddEvenSets three= new OddEvenSets(list2);
				System.out.println(three);
				
				String list3= "4 4 4 4 4 4 4 4 ";
				OddEvenSets four= new OddEvenSets(list3);
				System.out.println(four);
				
				String list4= "1 1 1 1 1 1 1 1";
				OddEvenSets five= new OddEvenSets(list4);
				System.out.println(five);
				
				String list5= "1 2 3 4 5 6 7 8 9";
				OddEvenSets six= new OddEvenSets(list5);
				System.out.println(six);
				
	}
}