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
		symbols= new Stack<Character>();
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
			//if(s.charAt(x) =123||125||91||93||28||29||60||62)
			stacky[x]=s.charAt(x);
		}
		for(char i: stacky)
		{
			symbols.push(i);
		}
	}

	public boolean checkExpression()
	{
		int brak1=0;
		int	brak2=0;
		int	ar1=0; 
		int	ar2=0;
		int	par1=0; 
		int	par2=0;
		int	car1=0; 
		int	car2=0;
		while(symbols.empty()!=true)
		{
		 if(symbols.peek().equals("{"))
		 brak1++;
		
		 if(symbols.peek().equals("}"))
				 brak2++;
		 
		 if(symbols.peek().equals("["))
				 ar1++;
		 
		 if(symbols.peek().equals("]"))
				 ar2++;
		 
		 if(symbols.peek().equals("("))
			 par1++;
	 
		 if(symbols.peek().equals("("))
			 par2++;
		 
		 if(symbols.peek().equals("<"))
			 car1++;
	 
		 if(symbols.peek().equals(">"))
			 car2++;
		 
		 symbols.pop();
		}
		
		if(brak1==brak2&&ar1==ar2&&par1==par2&&car1==car2)
			return true;
		else 
			return false;
	}
	public String toString()
	{
		if(checkExpression()==false)
		{
			return exp+ " "+ "is incorrect";
		}
		else return exp+ " "+ "is correct";
	}

	//write a toString
}