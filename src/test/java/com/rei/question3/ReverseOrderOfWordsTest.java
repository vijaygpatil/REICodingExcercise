package com.rei.question3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseOrderOfWordsTest {

	@Test
	public void testExampleString1() {
		assertEquals("fox brown quick A", ReverseOrderOfWords.reverseWordOrder("A quick brown fox"));
	}

	@Test
	public void testExampleString2() {
		assertEquals("industry typesetting and printing the of text dummy simply is Ipsum Lorem", ReverseOrderOfWords.reverseWordOrder("Lorem Ipsum is simply dummy text of the printing and typesetting industry"));
	}
}