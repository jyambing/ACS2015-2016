/*package maps;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{

map= new TreeMap<String, Set<String>>();

	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		Set setty= new TreeSet<String>();
for(int x=0; x< personRelative.length; x++)
	if(map.get(personRelative[x])==null)
		map.put(personRelative[x], setty);
		else
			setty.add(personRelative[x+1]);
			map.put(personRelative[x], setty);







	}


	public String getRelatives(String person)
	{
		return map.get(person);
	}


	public String toString()
	{
		String output="";

for(String name: map.keySet()){
	output+= name+ " is related to " + map.get(name)+ "\n";
}
		return output;
	}
}
*/