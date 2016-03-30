package stacks;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import java.util.Stack;
import static java.lang.System.*;

public class IntStack
{

	//option 2
	private ArrayList<Integer> listOfInts;
	private String exp="";

	public IntStack()
	{
		listOfInts= new ArrayList<Integer>();
	}

	public void push(int item)
	{
		listOfInts.add(item);
		exp+=item;
	}

	public int pop()
	{
		int rem= peek();
		listOfInts.remove(listOfInts.size()-1);
		return rem;
		
	}

	public boolean isEmpty()
	{
		return listOfInts.isEmpty();
	}

	public int peek()
	{
		return listOfInts.get(listOfInts.size()-1);
	}

	public String toString()
	{
		return "["+exp+"]";
	}
}