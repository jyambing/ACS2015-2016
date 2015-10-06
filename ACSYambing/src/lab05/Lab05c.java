package lab05;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05c
{
	public static void main ( String[] args )
	{
		Scanner scan = new Scanner(System.in);
		out.print("Enter a word:: ");
		String word= scan.next();
		if(word.length()%2==0)
		{	out.print(word+ " is even");
		}
		else out.print(word + " is odd");
	}
}