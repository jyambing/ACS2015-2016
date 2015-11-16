package Lab13_scanner_files;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Social
{
 private String socialNum;

	public Social()
	{

socialNum="";
	}

	public Social(String soc)
	{

socialNum=soc;
	}

	public void setSocial(String soc)
	{

socialNum=soc;
	}

	public int getSum()
	{
int total=0;
Scanner chop= new Scanner(socialNum);
chop.useDelimiter("-");
while(chop.hasNext()){
int num= chop.nextInt();
total+=num;
}
		return total;
	}

	public String toString()
	{
		return "SS# " +socialNum+ " has a sum of "+ getSum();
	}
}