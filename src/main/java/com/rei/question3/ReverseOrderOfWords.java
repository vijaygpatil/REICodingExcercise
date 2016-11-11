package com.rei.question3;

/**
 * Reversing the order of words.
 * @author patil
 */
public class ReverseOrderOfWords {
	public static String reverseWordOrder(String s) {
		//Reverse the entire String
		String reverseString = reverseString(s);
		String reverseWord = "";
		int prevSpace = -1;
		int i = 0;
		int n = s.length();
		
		//Reverse ever word of reversed String
		while (i < n) {
			if (reverseString.charAt(i) == ' ') {
				reverseWord = reverseWord + reverseString(reverseString.substring(prevSpace + 1, i));
				reverseWord = reverseWord + " ";
				prevSpace = i;
			}
			i++;
		}
		
		//Since above while loop will not handle the last word, you will have to reverseString for the last word.
		reverseWord = reverseWord + reverseString(reverseString.substring(prevSpace + 1, n));
		
		//Return
		return reverseWord;
	}

	public static String reverseString(String str) {
		if (str.length() == 1) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		System.out.println("Example String 1");
		System.out.println("String - 'A quick brown fox'");
		System.out.println("ReversedWordOrder: "+reverseWordOrder("A quick brown fox"));
		System.out.println();
		
		System.out.println("Example String 2");
		System.out.println("String - 'Lorem Ipsum is simply dummy text of the printing and typesetting industry'");
		System.out.println("ReversedWordOrder: "+reverseWordOrder("Lorem Ipsum is simply dummy text of the printing and typesetting industry"));
		System.out.println();
	}
}
