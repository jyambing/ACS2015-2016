package Lab13_scanner_files;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Box
{
   private String let;
   private int size;

public Box()
{
	let="";
	size=0;
}
	public Box(String line)
{
Scanner chop= new Scanner(line);
let= chop.next();
size= chop.nextInt();
}
	
	public String toString()
	{
		String output="";
for(int x=0; x<size; x++){
	for(int y=0; y<size; y++){
		output+=let;
	}
	output+="\n";
	}
	return output;
}
}