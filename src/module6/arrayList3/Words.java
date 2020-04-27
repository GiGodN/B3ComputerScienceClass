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
	
	public static void main( String args[] )
	{
		String[] wrds = "one two three four five six seven alligator".split(" ");
		Words test = new Words( wrds );
		out.println(test);
		out.println("word with 2 vowels = "+test.countWordsWithXVowels(2));
		out.println("word with 3 vowels = "+test.countWordsWithXVowels(3));
		out.println("word with 4 vowels = "+test.countWordsWithXVowels(4));
		out.println("word with 2 chars = "+test.countWordsWithXChars(2));
		out.println("word with 3 chars = "+test.countWordsWithXChars(3));		
		out.println("word with 4 chars = "+test.countWordsWithXChars(4));
		out.println("word with 5 chars = "+test.countWordsWithXChars(5));
		int vowelsRemoved = test.removeWordsWithXChars(3);
		out.println("\nafter removing words with 3 chars \n" + test);
		out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		out.println("\n\n");		
				
		//add more test cases
	
	}
}