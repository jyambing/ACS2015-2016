package lab04;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab04a
{
	public static void main ( String[] args )
	{
		AddString demo = new AddString("hello","world");
		demo.add();
		out.println(demo);

		demo.setStrings("jim","bob");
		demo.add();
		out.println(demo);

		//add more test cases
		
		String comp = "computer";
		String sci = "science";
		AddString test = new AddString(comp, sci);
		System.out.println(test);
	}
}