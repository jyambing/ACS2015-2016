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

public class Lab06d
{
	public static void main ( String[] args ) throws IOException
	{
		ArrayList<SiteName> site= new ArrayList<SiteName>();
		Scanner file = new Scanner(new File ("data/lab06d.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i < size; i++)
		{
			site.add(new SiteName (file.nextLine()));
		}

		Collections.sort(site);
		for(SiteName word: site)
		{
			System.out.println(word);
		}
		}
		}