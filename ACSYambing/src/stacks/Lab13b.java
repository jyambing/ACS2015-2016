package stacks;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class Lab13b
{
	public static void main ( String[] args )
	{
		String uno="(abc(*def)";
		SyntaxChecker one= new SyntaxChecker(uno);
		System.out.println(one);
		
		String dos="[{}]";
		SyntaxChecker two= new SyntaxChecker(dos);
		System.out.println(two);
		
		String tres= "[";
		SyntaxChecker three= new SyntaxChecker(tres);
		System.out.println(three);	
		
		String quatro= "[{<()>}]";
		SyntaxChecker four= new SyntaxChecker(quatro);
		System.out.println(four);	
		
		String cinco= "{<html[value=4]*(12)>{$x}}";
		SyntaxChecker five= new SyntaxChecker(cinco);
		System.out.println(five);	
		
		String siez= "[one]<two>{three}(four)";
		SyntaxChecker six= new SyntaxChecker(siez);
		System.out.println(six);	
		
		String siete = "car(cdr(a)(b)))";
		SyntaxChecker seven= new SyntaxChecker(siete);
		System.out.println(seven);	
		
		String ocho= "car(cdr(a)(b))";
		SyntaxChecker eight= new SyntaxChecker(ocho);
		System.out.println(eight);	
	}
}