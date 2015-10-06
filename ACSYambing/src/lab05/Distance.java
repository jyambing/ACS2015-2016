package lab05;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{
x1=y1=x2=y2=0;
	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
x1=xOne;
y1=yOne;
x2=xTwo;
y2=yTwo;
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1=xOne;
		y1=yOne;
		x2=xTwo;
		y2=yTwo;
	}

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0;
		String result=" is closer to (0,0)";
distanceA= Math.sqrt((double)Math.pow(x1, 2)+Math.pow(y1, 2));
distanceB= Math.sqrt((double)Math.pow(x2, 2)+Math.pow(y2, 2));

if(distanceA>distanceB)
return "B"+ result;

		return "A" + result;
	}
	
	public String toString()
	{
		return determineClosest();
	}
}