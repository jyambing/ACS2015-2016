package arraylist;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Number
{
	private Integer number;

	public Number()
	{
		number=0;
	}

	public Number(int num)
	{
		number=num;
	}


	public void setNumber(int num)
	{
		number=num;
	}

	public int getNumber()
	{
		return number;
	}

	public boolean isOdd()
	{
		boolean truth;
		if(number%2==0)
		truth=false;
		else truth=true;
			return truth;
	}

	public boolean isPerfect()
	{
		int total=0;
		for(int x= 1;x < number; x++)
			if(number%x==0)
				total=total+x;
		return (number==total);
	}

	public String toString( )
	{
		return ""+number;
	}
}
