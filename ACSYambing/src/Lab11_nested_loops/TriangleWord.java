package Lab11_nested_loops;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

class TriangleWord
{
 private String word;

	public TriangleWord()
	{
word="";
	}

	public TriangleWord(String w)
	{
word=w;
	}

	public void setWord(String w)
	{
word=w;
	}

	public String toString()
	{
		String output="";
for(int x=1; x<=word.length(); x++)
{
	for(int y=0; y<word.length()-x; y++)
	{ output+=" ";
	}
	output+=word.substring(x-1, x)+"\n";
}
for(int x=1; x<=word.length(); x++)
{
	for(int y=0; y<x; y++)
	{ output+=" ";
	}
	output+=word.substring(x-1, x)+"\n";
}
		return output+"\n";
	}
}