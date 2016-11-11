package com.rei.question1;

/**
 * Program to convert increasing integer array to increasing ranges
 * @author patil
 */
public class IntegerArrayToIncreasingRanges {
	public static String sequenceToRanges(int[] nums) {
		StringBuilder sb = new StringBuilder();
		int startIndex = 0;
		int previousIndex = 0;
		int currentVal = 0;
		int n = nums.length;
		
		//For numbers starting from index 1 to n - 1, detect increasing sequences and decreasing sequences.
		for (int i = 1; i < n; i++) {
			currentVal = nums[i];
			
			if (i == n - 1) { //For last index of the array
				sb.append("(" + startIndex + "-" + ++previousIndex + ")");
				break;
			} else if (currentVal >= nums[previousIndex]) { //For increasing or equals sequence
				previousIndex++;
				continue;
			} else { //For reduced sequence
				if (startIndex != previousIndex) { //StartIndex and previousIndex will be equals in case of reducing sequence
					sb.append("(" + startIndex + "-" + previousIndex + ")");
				}
				startIndex = i;
				++previousIndex;
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println("Example Range");
		System.out.print("Array - { 1, 2, 3, 4, 5, 6, 3, 6, 8, 5, 8, 9, 4, 3, 5 }, Ranges: ");
		System.out.println(sequenceToRanges(new int[] { 1, 2, 3, 4, 5, 6, 3, 6, 8, 5, 8, 9, 4, 3, 5 }));
		System.out.println();

		System.out.println("Single Range");
		System.out.print("Array - {1, 2, 3, 4, 5, 6, 7, 8, 9}, Ranges: ");
		System.out.println(sequenceToRanges(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		System.out.println();

		System.out.println("Double Range");
		System.out.print("Array - {1, 2, 3, 4, 5, 3, 6, 8, 9, 10}, Ranges: ");
		System.out.println(sequenceToRanges(new int[] { 1, 2, 3, 4, 5, 3, 6, 8, 9, 10 }));
		System.out.println();

		System.out.println("Triple Range");
		System.out.print("Array - {1, 2, 3, 4, 5, 3, 6, 8, 9, 10, 1, 5, 8, 9}, Ranges: ");
		System.out.println(sequenceToRanges(new int[] { 1, 2, 3, 4, 5, 3, 6, 8, 9, 10, 1, 5, 8, 9 }));
		System.out.println();
		
		System.out.println("Sequence Numbers Reduces More than Once");
		System.out.print("Array - { 1, 2, 3, 4, 5, 6, 3, 6, 8, 5, 8, 9, 4, 3, 5, 2, 3, 4, 6, 7, 1, 4, 5 }, Ranges: ");
		System.out.println(sequenceToRanges(new int[] { 1, 2, 3, 4, 5, 6, 3, 6, 8, 5, 8, 9, 4, 3, 2, 1, 5, 2, 3, 4, 6, 7, 1, 4, 5 }));
		System.out.println();
		
		System.out.println("Sequence Numbers Reduces and Repeats More than Once");
		System.out.print("Array - { 1, 2, 3, 4, 4, 4, 5, 6, 3, 6, 8, 5, 8, 8, 8, 9, 4, 3, 2, 1, 5, 2, 3, 4, 6, 7, 1, 4, 5 }, Ranges: ");
		System.out.println(sequenceToRanges(new int[] { 1, 2, 3, 4, 4, 4, 5, 6, 3, 6, 8, 5, 8, 8, 8, 9, 4, 3, 2, 1, 5, 2, 3, 4, 6, 7, 1, 4, 5 }));
		System.out.println();
	}
}
