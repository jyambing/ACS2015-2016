package stacks;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;

	public PostFix()
	{
		setExpression("");
	}

	public PostFix(String exp)
	{
		stack= new Stack<Double>();
		setExpression(exp);
	}

	public void setExpression(String exp)
	{
		expression=exp;
	}

	public double calc(double one, double two, char op)
	{
		
		return 0.0;
	}

	public void solve()
	{
	}

	//add a toString
}