package stacks;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab13c
{
	public static void main ( String[] args )
	{
		PostFix one= new PostFix("2 7 + 1 2 + +");
		PostFix two= new PostFix("1 2 3 4 + + +");
		PostFix three= new PostFix("9 3 * 8 / 4 +");
		PostFix four= new PostFix("3 3 + 7 * 9 2 / +");
		PostFix five= new PostFix("9 3 / 2 * 7 9 * + 4 –");
		PostFix six= new PostFix("5 5 + 2 * 4 / 9 +");
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
	}
}