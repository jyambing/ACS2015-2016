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

public class Lab07c
{
	public static void main(String args[]) throws IOException
	{
		//add test cases
		String list1 ="1 2 3 4 5";
		String list2= "4 5 6 7 8";
		MathSet one = new MathSet(list1, list2);
		System.out.println(one);
		
		String list3 ="10 11 12 13 14 15 16 17";
		String list4= "11 13 15 17 19 21 23";
		MathSet two = new MathSet(list3, list4);
		System.out.println(two);
		
		String list5 ="4 5 5 6 76 7 7 8 8 8 8 8";
		String list6= "23 3 4 3 5 3 53 5 46 46 4 6 5 3 4";
		MathSet three = new MathSet(list5, list6);
		System.out.println(three);
		
	}
}
