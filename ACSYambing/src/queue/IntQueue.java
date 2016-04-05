package queue;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueue
{
	//pick your storage for the queue
	//you can use the an array or an ArrayList

	//option 1
	private int[] rayOfInts;
	private int numInts;

	//option 2
	private ArrayList<Integer> queue;
	private String qStringy;

	public IntQueue()
	{
		queue=new ArrayList<Integer>();
		qStringy="";
	}

	public void add(int item)
	{
		queue.add(item);
		qStringy+=" "+item; 
	}

	public int remove()
	{
		return queue.remove(0);
	}

	public boolean isEmpty()
	{
		return queue.size()==0;
	}

	public int peek()
	{
		return queue.get(0);
	}

	public String toString()
	{
		return qStringy;
	}
}

