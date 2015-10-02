package lab04;
//© A+ Computer Science  -  www.apluscompsci.com
	//Name -
	//Date -
	//Class -
	//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

	public class Lab04f
{
		public static void main ( String[] args )
		{
			Scanner input = new Scanner(System.in);
			out.println("Hello Pal! Let's generate a random name for you!");
			out.println("Please enter your first and last name now:");
			String name= input.nextLine(); 
			NamesGenerator person = new NamesGenerator(name);
			out.println("Please enter your favorite color from ROYGBIV:");
			String color= input.nextLine();
			person.firstQuestion(color);
			out.println("Please enter your favorite sport:");
			String sport= input.nextLine(); 
			person.secondQuestion(sport);
			out.print(person);
		}
		
}
		
