package LinkedList;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.*;
import static java.lang.System.*;

public class HistoList {
	private HistoNode front;

	public HistoList() {
		front = null;
	}

	// addLetter will add a new node to the front for let if let does not exist
	// addLetter will bump up the count if let already exists
	public void addLetter(char let) {
		HistoNode current= front;
		if(front.indexOf(let)==-1)
			new HistoNode(let, 1, null);
		else
		front.setLetterCount(front.getLetterCount()+1);
	}

	// returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{	HistoNode current= front;
		int count=0;
		while(current!=null)
		{
		if(current.getLetter()==let){
			return count;
		}
		count++;
		current= current.getNext();
	}
		return -1;
	}

// returns a reference to the node at spot
private HistoNode nodeAt(int spot)
	{
		HistoNode current=front;
		for(int x=0; x<spot; x++){
			current=current.getNext();
		}
		return current;
	}
// return a string will all values from list
public String toString(){
	String output="";
	return output;
}
}