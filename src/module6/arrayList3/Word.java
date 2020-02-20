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
	
	public static void main(String[] args) {
		Word one = new Word("chicken");
		out.println(one);
		out.println("num vowels == " + one.getNumVowels());
		out.println("num chars == " + one.getLength());
		one.setWord("alligator");
		out.println("\n\n" + one);
		out.println("num vowels == " + one.getNumVowels());
		out.println("num chars == " + one.getLength());
		one.setWord("elephant");
		out.println("\n\n" + one);
		out.println("num vowels == " + one.getNumVowels());
		out.println("num chars == " + one.getLength());
	}
}