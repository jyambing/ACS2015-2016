package stacks;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Stack;
import static java.lang.System.*;

public class StackTester
{
	private Stack<String> stack;
	private String popped=""; 
	public StackTester()
	{
		setStack("");
	}

	public StackTester(String line)
	{
		stack= new Stack<String>();
		setStack(line);
	}
	
	public void setStack(String line)
	{
		
		String[] stacky = line.split(" ");
		for(String i: stacky)
		{
			stack.push(i);
		}
	}

	public void popEmAll()
	{
		System.out.println("Poppin' all the the items from the stack");
		while(stack.empty()!=true)
		{
		popped+=" "+stack.pop();
		}
	}
	public String toString()
	{
		return popped;
	}
	//add a toString
}