package module6.arrayList3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static java.lang.System.*;

public class Words {
	private ArrayList<Word> words;

	public Words(String[] wordList) {
		words = new ArrayList<Word>();
		for (String word : wordList) {
			words.add(new Word(word));
		}
	}

	public int countWordsWithXChars(int size) {
		int count = 0;
		for (Word w : words) {
			if (w.getLength() == size)
				count++;
		}
		return count;
	}

	// this method will remove all words with a specified size / length
	// this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size) {
		int countV = 0;
		ArrayList<Word> toBeRm = new ArrayList<Word>();
		for (Word w : words) {
			if (w.getLength() == size) {
				countV+=w.getNumVowels();
				toBeRm.add(w);
			}	
		}
		for(Word w : toBeRm) {
			words.remove(w);
		}
		return countV;
	}

	public int countWordsWithXVowels(int numVowels) {
		int count = 0;
		for (Word w : words) {
			if (w.getNumVowels() == numVowels)
				count++;
		}
		return count;
	}

	public String toString() {
		return words.toString();
	}
}