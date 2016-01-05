package iterators;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorTest {
	private ArrayList<String> list;
	private String toRemove;

	public IteratorTest(String line, String rem) {
		String[] words = line.split(" ");

		list = new ArrayList<String>(Arrays.asList(words));
		toRemove = rem;
	}

	public void setTest(String line, String rem) {
		String[] words = line.split(" ");
		toRemove = rem;
		list = new ArrayList<String>(Arrays.asList(words));
	}

	public void remove() {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().equals(toRemove)) {
				it.remove();
			}
		}
		/*
		 * for(String x: list) if(x.equals(toRemove)) list.remove(x)
		 */;
	}

	public String toString() {
		return list.toString();
	}
}