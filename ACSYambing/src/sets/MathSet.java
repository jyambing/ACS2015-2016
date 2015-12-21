package sets;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
	}

	public MathSet(String o, String t)
	{
		String[] words= o.split(" ");
		String[] words2 = t.split(" ");
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
		
		for(String x: words)
		{
			int y= Integer.parseInt(x);
			one.add(y);
		}
		for(String x: words2)
		{
			int y= Integer.parseInt(x);
			two.add(y);
		}
	}

	public Set<Integer> union()
	{
		Set<Integer> all= new TreeSet<Integer>();
		all.addAll(one);
		all.addAll(two);
		return all;
	}

	public Set<Integer> intersection()
	{
		return null;
	}

	public Set<Integer> differenceAMinusB()
	{
		return null;
	}

	public Set<Integer> differenceBMinusA()
	{
		return null;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		return null;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}