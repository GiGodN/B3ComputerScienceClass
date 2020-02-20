package module6.arrayList3;

import static java.lang.System.*;

public class Word {
	private static String vowels = "AEIOUaeiou";
	private String word;
	
	public Word(String word) {
		this.word = word;
	}

	public int getNumVowels() {
		int amount = 0;
		for (char vow : vowels.toCharArray()) {
			for (char wor : word.toCharArray()) {
				if (wor == vow) {
					amount++;
				}
			}
		}
		return amount;
	}
	
	public int getLength() {
		return word.length();
	}
	
	public void setWord(String word) {
		this.word = word;
	}

	public String toString() {
		return word;
	}
}