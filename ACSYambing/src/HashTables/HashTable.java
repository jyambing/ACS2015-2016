package HashTables;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
		table = new LinkedList[10];
	}

	public void add(Number obj)
	{
		
		int i = obj.hashCode();
		System.out.println(i);
		if(table[i].contains(obj))
			System.out.println(table[i].add(obj));
	}

	public String toString()
	{
		String output="HASHTABLE\n";
		for(int x=0; x< table.length; x++){
			output+= "bucket "+ table[x];
		}
		return output;
	}
}