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
	private Stack<Double> nums;
	private Stack<Character> ops;
	private String expression;

	public PostFix()
	{
		setExpression("");
	}

	public PostFix(String exp)
	{
		nums= new Stack<Double>();
		ops= new Stack<Character>();
		setExpression(exp);
	}

	public void setExpression(String exp)
	{
		expression=exp;
		String[] split= expression.split(" ");
		for(int x=0; x<split.length; x++)
		{
			if(split[x].charAt(0)>=48 && split[x].charAt(0)<=57)
				nums.push(Double.parseDouble(split[x]));
			else
				ops.push(split[x].charAt(0));
		}
	}

	public double calc()
	{
		double output= nums.pop();
		for(Character x: ops)
		{
			if(x=='+')
				output+=nums.pop();
			if(x=='-')
				output-=nums.pop();
			if(x=='*')
				output*=nums.pop();
			if(x=='/')
				output/=nums.pop();
			if(x=='%')
				output%=nums.pop();
		}
		return output;
	}

	public void solve()
	{
	}

	public String toString()
	{
		return "" +this.calc();
	}
	//add a toString
}