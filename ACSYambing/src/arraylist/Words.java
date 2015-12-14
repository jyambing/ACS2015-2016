package arraylist;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words {
	private ArrayList<Word> words;

	public Words() {
		setWords("");
	}

	public Words(String wordList) {
		setWords(wordList);
	}

	public void setWords(String wordList) {
		words = new ArrayList<Word>();
		Scanner chop = new Scanner(wordList);
		while (chop.hasNext()) {
			words.add(new Word(chop.next()));
		}
	}

	public int countWordsWithXChars(int size) {
		int count = 0;
		for (Word word : words) {
			if (word.getLength() == size)
				count++;
		}
		return count;
	}

	// this method will remove all words with a specified size / length
	// this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size) {
		int totalVowel = 0;
		for (int x = 0; x < words.size(); x++) {
			if (words.get(x).getLength() == size) {
				totalVowel += words.get(x).getNumVowels();
				words.remove(x);
			}
		}
		return totalVowel;
	}

	public int countWordsWithXVowels(int numVowels) {
		int count = 0;

		for (Word word : words) {
			if (word.getNumVowels() == numVowels)
				count++;
		}

		return count;
	}

	public String toString() {
		return "" + words;
	}
}