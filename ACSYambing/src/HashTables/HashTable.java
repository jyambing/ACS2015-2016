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
		for(int x=0; x<table.length; x++)
		{
			table[x]= new LinkedList();
		}
	}

	public void add(Number obj)
	{
		int i = obj.hashCode();
		if(!(table[i].contains(obj)))
			table[i].add(obj);
	}

	public String toString()
	{
		String output="HASHTABLE\n";
		for(int x=0; x< table.length; x++){
			output+= "bucket "+ x + " " + table[x]+ "\n";
		}
		return output;
	}
}