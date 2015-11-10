package Lab11_nested_loops;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleTwo
{
 private int size;
 private String letter;

	public TriangleTwo()
	{
size=0;
letter="";
	}

	public TriangleTwo( String let, int sz)
	{
letter=let;
size=sz;
	}

	public void setTriangle(int count, String let)
	{
size=count;
letter=let;

	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
	for(int x=1; x<=size; x++)
	{
		for(int y=size; y>=x; y--)
		output+=letter;
		output+="\n";
	}
	return output;
	}
}