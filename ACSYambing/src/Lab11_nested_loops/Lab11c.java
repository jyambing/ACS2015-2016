package Lab11_nested_loops;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab11c
{
 public static void main( String args[] )
 {
	 	Scanner keyboard = new Scanner(System.in);
	 	String choice="";
			do{
				out.print("Enter the size of the triangle : ");
				int big = keyboard.nextInt();
				out.print("Enter a letter : ");
				String value = keyboard.next();

				TriangleThree T3= new TriangleThree(big, value);
					//static methods can be called using the class name
				System.out.println(T3);

				System.out.print("Do you want to enter more data? ");
				choice=keyboard.next();
			}while(choice.equals("Y")||choice.equals("y"));
		}
	}