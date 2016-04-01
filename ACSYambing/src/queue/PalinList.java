package queue;
//© A+ Computer Science  -  www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList {
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList() {
		stack = new Stack<String>();
		queue = new LinkedList<String>();
		setList("");
	}

	public PalinList(String list) {
		stack = new Stack<String>();
		queue = new LinkedList<String>();
		setList(list);
	}

	public void setList(String list) {
		queue.clear();
		stack.clear();
		String[] stacky = list.split(" ");
		for (String i : stacky) {
			stack.add(i);
			queue.add(i);

		}
	}

	public boolean isPalin() {
		while (stack.isEmpty() != false&&queue.isEmpty()!=false) {
			
			String p =stack.pop();
			System.out.println(p);
			String q=queue.poll();
			if (!p.equals(q)) {
				return false;
			}

		}
		return true;
	}

	public String toString() {
		if (isPalin() == true)
			return stack + " is a palinlist";
		else
			return stack + " is not a palinlist";

	}

	// write a toString method
}