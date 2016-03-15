package stacks;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab13a
{
	public static void main ( String[] args )
	{
		String uno="a b c d e f g h i";
		StackTester one= new StackTester(uno);
		one.popEmAll();
		System.out.println(one);
		
		String dos="1 2 3 4 5 6 7 8 9 10";
		StackTester two= new StackTester(dos);
		two.popEmAll();
		System.out.println(two);
		
		String tres= "# $ % ^ * ( ) ) _";
		StackTester three= new StackTester(tres);
		three.popEmAll();
		System.out.println(three);
	}
}
