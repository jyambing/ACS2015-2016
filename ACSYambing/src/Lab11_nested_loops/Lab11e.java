package Lab11_nested_loops;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab11e
{
 public static void main( String args[] )
 {
	 	Scanner keyboard = new Scanner(System.in);
	 	String choice="";
			do{
				out.print("Enter the size of the box : ");
				int big = keyboard.nextInt();

				Box b1= new Box(big);
					//static methods can be called using the class name
				System.out.println(b1);

				System.out.print("Do you want to enter more data? ");
				choice=keyboard.next();
			}while(choice.equals("Y")||choice.equals("y"));
		}
	}