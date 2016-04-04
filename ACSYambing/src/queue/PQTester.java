package queue;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private PriorityQueue<String> pQueue;

	public PQTester()
	{
		pQueue = new PriorityQueue<String>();
		setPQ("");
	}

	public PQTester(String list)
	{
		pQueue = new PriorityQueue<String>();
		setPQ(list);
	}

	public void setPQ(String list)
	{
		pQueue.clear();
		String[] stacky = list.split(" ");
		for (String i : stacky) {
			pQueue.add(i);
		}
	
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public String getNaturalOrder()
	{
		
		String output="";
		return output;		
	}

	public String toString()
	{
		return "toString() - " + pQueue +"/n getMin() - "+ getMin() + "/n getNaturalOrder() - "+ getNaturalOrder();
		
	}	
}