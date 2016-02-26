package maps;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Part implements Comparable<Part>
{
	private String make, model, rest;
	private int year;

	public Part(String line) 
	{
		String[] list = line.split(" ");

		make= list[list.length-3];
		model= list[list.length-2];
		year= list[list.length-1]; 
		rest=

	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{





		return 0;
	}

	public String toString()
	{
		return "";
	}
}