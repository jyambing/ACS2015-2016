package queue;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		setList(list);
	}

	public void setList(String list)
	{
		stack= new Stack<String>();
		String[] stacky= list.split(" ");
		for(String i: stacky)
		{
			stack.push(i);
			queue.add(i);
			
		}
	}

	public boolean isPalin()
	{
		for(String x: stack)
			if(stack.peek().)
		return true;
	}


	//write a toString method
}