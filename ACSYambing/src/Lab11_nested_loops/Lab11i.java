package Lab11_nested_loops;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab11i
{
	 public static void main( String args[] )
	 {
		 	Scanner keyboard = new Scanner(System.in);
		 	String choice="";
				do{
					out.print("Enter the word you want as your triangle : ");
					String wordy = keyboard.next();

					TriangleWord tword= new TriangleWord(wordy);
						//static methods can be called using the class name
					System.out.println(tword);

					System.out.print("Do you want to enter a new word? ");
					choice=keyboard.next();
				}while(choice.equals("Y")||choice.equals("y"));
			}
		}