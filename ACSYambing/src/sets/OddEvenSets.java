package sets;
	//© A+ Computer Science  -  www.apluscompsci.com
	//Name -
	//Date -
	//Class -
	//Lab  -

	import java.util.Set;
	import java.util.TreeSet;
	import java.util.Arrays;
	import java.util.Scanner;
	import static java.lang.System.*;

	public class OddEvenSets
	{
		private Set<Integer> odds;
		private Set<Integer> evens;

		public OddEvenSets()
		{
		}

		public OddEvenSets(String line)
		{
			String[] words = line.split(" ");
			Set<String> all= new TreeSet<String>(Arrays.asList(words));
			odds = new TreeSet<Integer>();
			evens = new TreeSet<Integer>();
			
			for(String x: words)
			{
				int y = Integer.parseInt(x);
				if(y%2==0)
					evens.add(y);
				else
					odds.add(y);
			}
		}

		public String toString()
		{
			return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
		}
	}