package Lab11_nested_loops;
	//© A+ Computer Science  -  www.apluscompsci.com
	//Name -
	//Date -
	//Class -
	//Lab  -

	import static java.lang.System.*;
	import java.util.Scanner;

	public class TriangleOne
	{
	   //this lab is setup with a single static method
	   //there are no instance variables or additional methods / constructors

		public static String createTriangle( String let, int size)
		{ 
			String output="";
			for(int x=0; x<=size; x++)
			{
				for(int y=0; y<x; y++){
					output=output+let;
				}
				output= output+"\n";
			}
				return output;
		}
	}

