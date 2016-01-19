package maps;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanishToEnglish
{
	private Map<String,String> pairs;

	public SpanishToEnglish()
	{
		pairs= new TreeMap<String,String>();
	}

	public void putEntry(String entry)
	{
		String[] list = entry.split(" ");
		String key= list[0];
		String val= list[1];
		pairs.put(key, val);
	}

	public String translate(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";
		while(chop.hasNext())
			output+=pairs.get(chop.next()+" ");
		return output;
	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}