package stacks;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker()
	{
		setExpression("");
	}

	public SyntaxChecker(String s)
	{
		symbols= new Stack<Character>();
		setExpression(s);
	}
	
	public void setExpression(String s)
	{
		exp=s;
		char[] stacky= new char[s.length()];
		for(int x=0; x<s.length(); x++)
		{
			stacky[x]=s.charAt(x);
		}
		for(char i: stacky)
		{
			symbols.push(i);
		}
	}

	public boolean checkExpression()
	{
		int brak1, brak2, ar1, ar2;
		while(symbols.empty()!=true)
		{
		 if(symbols.peek().equals("{"){
		 brak1++;
		 }
		 else if(symbols.peek().equals("}"){
				 brak2++;
		 }
		 else if(symbols.peek().equals("["){
				 ar1++;
		 }
		 else if(symbols.peek().equals("]"){
				 ar2++;
		 }
		}
		
		
		return false;
	}
	public String toString()
	{
		if(symbols.checkExpression())
		{
			return exp+ " "+ "is correct";
		}
		else return exp+ " "+ "is incorrect";
	}

	//write a toString
}