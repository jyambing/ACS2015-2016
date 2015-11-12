package Lab13_scanner_files;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class OddOrEven
{
	private int number;

	public OddOrEven()
	{

number=0;
	}

	public OddOrEven(int num)
	{

number=num;
	}

	public void setNum(int num)
	{

number=num;
	}

	public boolean isOdd( )
	{
boolean result= true;
if(number %2==0)
 result=false;
		return result;
	}

	public String toString()
	{
String statement =number+" is even.\n\n";
 if(isOdd()==true){
	statement= number+ " is odd. \n\n";
	}
 return statement;
}
}