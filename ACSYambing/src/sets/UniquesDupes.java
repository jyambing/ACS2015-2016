package sets;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		String[] letters= input.split(" ");
		Set<String> uniques = new TreeSet<String>(Arrays.asList(letters));
		//add code

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		Set<String> setToReturn= new TreeSet();
		Set<String> set1= new TreeSet();
		String[] letters= input.split(" ");
		List<String> list = new ArrayList<String>(Arrays.asList(letters));
		
		for(String word: list){
			if(!set1.add(word)){
				setToReturn.add(word);
			}
		}
		return setToReturn;
	
}
}