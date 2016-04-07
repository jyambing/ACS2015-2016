package LinkedList;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
		
		for(int x=0; x<list.size(); x++)
		{
			total+=list.get(x);
		}
		//while(list!=null)
		//{
		//	total+=list.get();
		//	list=list.next();
		//}
		return total;
	}

	public double getAvg(  )
	{
		return getSum()/list.size();
		
	}

	public int getLargest()
	{
		int largest=Integer.MIN_VALUE;
		for(int x=0; x<list.size(); x++)
		{
			if(x>largest)
				largest=x;
		}
		return largest;
	}

	public int getSmallest()
	{
		int smallest = smallest=Integer.MAX_VALUE;
		for(int x=0; x<list.size(); x++)
		{
			if(x<smallest)
				smallest=x;
		}
		return smallest;
	}

	public String toString()
	{
		return "SUM:: " + getSum() + "\n AVERAGE:: "+ getAvg() + "\n SMALLEST:: "+ getSmallest()+ "\n Largest:: "+ getLargest();
	
	}
}