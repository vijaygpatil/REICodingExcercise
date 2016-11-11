package com.rei.question1;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerArrayToIncreasingRangesTest {

	@Test
	public void testSequenceToRangesExampleRange() {
		assertEquals("(0-5)(6-8)(9-11)(13-14)", IntegerArrayToIncreasingRanges.sequenceToRanges(new int[] { 1, 2, 3, 4, 5, 6, 3, 6, 8, 5, 8, 9, 4, 3, 5 }));
	}

	@Test
	public void testSequenceToRangesSingleRange() {
		assertEquals("(0-8)", IntegerArrayToIncreasingRanges.sequenceToRanges(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
	}

	@Test
	public void testSequenceToRangesDoubleRange() {
		assertEquals("(0-4)(5-9)", IntegerArrayToIncreasingRanges.sequenceToRanges(new int[] { 1, 2, 3, 4, 5, 3, 6, 8, 9, 10 }));
	}

	@Test
	public void testSequenceToRangesTripleRange() {
		assertEquals("(0-4)(5-9)(10-13)", IntegerArrayToIncreasingRanges.sequenceToRanges(new int[] { 1, 2, 3, 4, 5, 3, 6, 8, 9, 10, 1, 5, 8, 9 }));
	}

	@Test
	public void testSequenceToRangesSequenceNumbersReducesMoreThanOnce() {
		assertEquals("(0-5)(6-8)(9-11)(15-16)(17-21)(22-24)", IntegerArrayToIncreasingRanges.sequenceToRanges(new int[] { 1, 2, 3, 4, 5, 6, 3, 6, 8, 5, 8, 9, 4, 3, 2, 1, 5, 2, 3, 4, 6, 7, 1, 4, 5 }));
	}

	@Test
	public void testSequenceToRangesSequenceNumbersReducesRepeatsMorethanOnce() {
		assertEquals("(0-7)(8-10)(11-15)(19-20)(21-25)(26-28)", IntegerArrayToIncreasingRanges.sequenceToRanges(new int[] { 1, 2, 3, 4, 4, 4, 5, 6, 3, 6, 8, 5, 8, 8, 8, 9, 4, 3, 2, 1, 5, 2, 3, 4, 6, 7, 1, 4, 5 }));
	}
}
