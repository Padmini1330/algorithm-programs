package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class InsertionSort 
{
	public void insertionSort(String[] wordArray) 
	{
		int arraySize = wordArray.length;

		for (int index = 1; index < arraySize; index++) 
		{
			String key = wordArray[index];
			int previousIndex = index - 1;
			while ((previousIndex >= 0) && (wordArray[previousIndex].compareTo(key) > 0)) 
			{
				wordArray[previousIndex + 1] = wordArray[previousIndex];
				previousIndex = previousIndex - 1;
			}
			wordArray[previousIndex + 1] = key;
		}
		System.out.println("The sorted array is : ");
		printArray(wordArray);
	}

	public void printArray(String[] wordArray) 
	{
		int arraySize = wordArray.length;
		for (int index = 0; index < arraySize; index++) 
		{
			System.out.print(wordArray[index] + ",");
		}
	}

	public static void main(String[] args) {

		InsertionSort sort = new InsertionSort();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of words: ");
		int arraySize = scanner.nextInt();
		String[] wordArray = new String[arraySize];

		System.out.println("Enter words");
		for (int index = 0; index < arraySize; index++) {
			String word = scanner.next();
			wordArray[index] = word;
		}

		System.out.println("The array of words are[unsorted] : ");
		sort.printArray(wordArray);
		
		System.out.println("");
		sort.insertionSort(wordArray);

	}
}
