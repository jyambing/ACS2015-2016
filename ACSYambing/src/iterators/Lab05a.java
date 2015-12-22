package iterators;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Lab05a
{
	public static void main ( String[] args )
	{
		
		IteratorTest one1= new IteratorTest("a b c a b c a", "a");
		one1.remove();
		System.out.println(one1);
		
		
	/*	
		//add test cases	
		String t1= "a b c a b c a     a";
		String r1= t1.substring(t1.length()-1);
		IteratorTest one= new IteratorTest(t1, r1);
		one.remove();
		System.out.println(one);
		
		String t2= "a b c a b c a     a";
		String r2= t2.substring(t2.length()-1);
		IteratorTest two= new IteratorTest(t2, r2);
		two.remove();
		System.out.println(two);
		
		String t3= "a b c a b c a     a";
		String r3= t3.substring(t3.length()-1);
		IteratorTest one= new IteratorTest(t1, r1);
		one.remove();
		System.out.println(one);*/
		
	}
}