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
			Integer[] nums = line.split();
			for(int numero: nums)
				if(numero%2==0)
					evens.add(numero);
				else odds.add(numero);
		}

		public String toString()
		{
			return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
		}
	}