package arraylist;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab16b
{
	public static void main( String args[] )
	{
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		out.println(test);
		out.println("odd count = "+test.countOdds());
		out.println("even count = "+test.countEvens());
		out.println("perfect count = "+test.countPerfects()+"\n\n\n");


		//add more test cases
		NumberAnalyzer t2 = new NumberAnalyzer("5 12 3 7 28 496 81 65 33 11");
		out.println(t2);
		out.println("odd count = "+t2.countOdds());
		out.println("even count = "+t2.countEvens());
		out.println("perfect count = "+t2.countPerfects()+"\n\n\n");

		NumberAnalyzer t3 = new NumberAnalyzer("1 2 3 4 5 6 7 8 11 13 151 16 17 18 19 20");
		out.println(t3);
		out.println("odd count = "+t3.countOdds());
		out.println("even count = "+t3.countEvens());
		out.println("perfect count = "+t3.countPerfects()+"\n\n\n");

			
	}
}