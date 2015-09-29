package lab04;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab04b
{
	public static void main (String[] args)
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		demo.findFirstLastLetters();
		out.println(demo);

		//add more test cases
		FirstAndLast test = new FirstAndLast("JukeBox");
		test.findFirstLastLetters();
		out.println(test);
		
		
		
		
	}
}
