package iterators;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class Lab05b
{
	public static void main ( String[] args )
	{
		
		ListIteratorTest one1= new ListIteratorTest("a b c a b c", "a", "+");
		one1.replace();
		System.out.println(one1);
		
		ListIteratorTest two1= new ListIteratorTest("a b c d e f g h i j x x x x", "x", "7");
		two1.replace();
		System.out.println(two1);
		
		ListIteratorTest three1= new ListIteratorTest("1 2 3 4 5 6 a b c a b c", "b", "#");
		three1.replace();
		System.out.println(three1);
		//add test cases		
	}
}