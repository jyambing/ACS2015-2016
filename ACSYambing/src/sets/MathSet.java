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
		Set<Integer> all = new TreeSet<Integer>();
		for( int x: one)
		{
			if(two.contains(x))
				all.add(x);
		}
		return all;
	}

	public Set<Integer> differenceAMinusB()
	{
	Set<Integer> all = new TreeSet<Integer>();
		for( int x: one)
		{
			if(!two.contains(x))
				all.add(x);
		}
		return all;
	}	

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> all = new TreeSet<Integer>();
		for( int x: two)
		{
			if(!one.contains(x))
				all.add(x);
		}
		return all;
	}
	
	public Set<Integer> symmetricDifference()
	{		Set<Integer> symDif= new TreeSet<Integer>();
	for(int x: one)
		{if(!two.contains(x))
			symDif.add(x);
		}
	for(int x: two)
	{if(!one.contains(x))
		symDif.add(x);
	}
		return symDif;
	}	
	
	public String toString()
	{
		String first= ( "Set one " + one + "\n" +	"Set two " + two +  "\n");
		String second= ("\n union - "+ union() + "\n intersection - "+ intersection());
		String third= ("\n difference A-B - " + differenceAMinusB() + "\n difference B-A - "+ differenceBMinusA());
		String fourth= ("\n symmetric difference - "+ symmetricDifference());
		return first+ second+ third+ fourth+ "\n";
	}
}