package comparable;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class Lab06c
{
	public static void main ( String[] args ) throws IOException
	{
		ArrayList<Person> words= new ArrayList<Person>();
Scanner file = new Scanner(new File ("data/lab06c.dat"));
int size = file.nextInt();
file.nextLine();
for(int i = 0; i < size; i++)
{
	words.add(new Person (file.nextInt(), file.nextInt(), file.nextInt(), file.next()));
}

Collections.sort(words);
for(Person word: words)
{
	System.out.println(word);
}
}
}