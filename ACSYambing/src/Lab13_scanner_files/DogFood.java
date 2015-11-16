package Lab13_scanner_files;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood
{
 private double amount;

 public DogFood()
 {
amount= 0;
 }

 public DogFood(String line)
 {
		Scanner chopper = new Scanner(line);
		double cups = 0;
while(chopper.hasNextDouble()){
	int weight= chopper.nextInt();
if(weight>=2&&weight<=4)
	cups+=3.5;
else if(weight>=5&&weight<=7)
	cups+=7.0;
else if(weight>=8&&weight<=9)
	cups+=10.5;
else if(weight>=10&&weight<=19)
	cups+=14.0;
else if(weight>=20&&weight<=39)
	cups+=24.5;
else if(weight>=40&&weight<=59)
	cups+=31.5;
else if(weight>=60&&weight<=79)
	cups+=42.0;
else cups+=52.5;
}

amount=cups/60;


 }

 public double getAmount()
 {
 	return amount;
 }

	public String toString()
	{
		return (int)Math.ceil(amount)+ "- 10 POUND BAGS";
	}
}