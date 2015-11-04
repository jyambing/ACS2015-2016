package Lab11_nested_loops;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Box
{
 private int size;

	public Box()
	{

size=0;

	}

	public Box(int count)
	{
size= count;

	}

	public void setSize(int count)
	{

size=count;

	}

	public int getSize()
	{
		return size;
	}

	public String toString()
	{
		{
			String output="";
			for(int i=0; i<size; i++)
			{
				for(int j=size-i; j>0; j--)
					output+="*";
					{
				for(int k=0; k<=i; k++)
					output+="#";
			}
			output+="\n";
		}
			return output+"\n";
		}
	}
}