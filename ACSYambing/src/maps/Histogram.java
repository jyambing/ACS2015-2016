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

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
	}

	public Histogram(String sent)
	{
		setSentence(sent);
	}
	
	public void setSentence(String sent)
	{
		histogram= new TreeMap<String, Integer>();
		String [] stuff= sent.split(" ");
		for(int x=0; x<stuff.length; x++)
			if(histogram.get(stuff[x])==null)
			histogram.put(stuff[x], 0); 
			else
			histogram.put(stuff[x],histogram.get(stuff[x]+1));
	}

	public String toString()
	{
		String output="";
		String allStars="";
		output= "char    1---5----01---5\n\n";
	for(String charName: histogram.keySet()){
		output+= charName+"\t";
		for(int y=0; y<histogram.get(charName); y++){
			output+="*";
		}
			output+= "\n";
	}
	return output+"\n\n";
}
}