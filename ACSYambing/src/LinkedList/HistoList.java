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
		if(front.indexOf(let)>0)
			front.setLetter(let);
		front.setLetterCount(front.getLetterCount()+1);
	}

	// returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{while(front!=null)
		
		if(front.getLetter()==let)
			front.setLetterCount(front.getLetterCount()+1);


		return -1;
	}

// returns a reference to the node at spot
private HistoNode nodeAt(int spot)
	{
		HistoNode current=null;
