package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class MergeSort<T extends Comparable<T>>
{
	
	void mergeSort(T wordArray[], int left, int right) 
	{
		if (left<right) 
		{
			int middle = left + (right - left) / 2;
			mergeSort(wordArray, left, middle);
			mergeSort(wordArray, middle + 1, right);
			merge(wordArray, left, middle, right);
		}

	}
	
	
	void merge(T wordArray[], int left, int middle, int right) 
	{

		int sizeOfLeft = middle - left + 1;
		int sizeOfRight = right - middle;

		T[] leftArray = (T[])new String[sizeOfLeft];
		T[] rightArray = (T[])new String[sizeOfRight];

		for (int indexLeft = 0; indexLeft < sizeOfLeft; indexLeft++)
			leftArray[indexLeft] = wordArray[left + indexLeft];

		for (int indexRight = 0; indexRight < sizeOfRight; indexRight++)
			rightArray[indexRight] = wordArray[middle + 1 + indexRight];

		int index1 = 0, index2 = 0;
		int sortedArrayindex = left;

		while (index1 < sizeOfLeft && index2 < sizeOfRight) 
		{
			if (leftArray[index1].compareTo(rightArray[index2]) <= 0) 
			{
				wordArray[sortedArrayindex] = leftArray[index1];
				index1++;
			} 
			else 
			{
				wordArray[sortedArrayindex] = rightArray[index2];
				index2++;
			}
			sortedArrayindex++;
		}

		while (index1 < sizeOfLeft) 
		{
			wordArray[sortedArrayindex] = leftArray[index1];
			index1++;
			sortedArrayindex++;
		}

		while (index2 < sizeOfRight) 
		{
			wordArray[sortedArrayindex] = rightArray[index2];
			index2++;
			sortedArrayindex++;
		}
	}

	public void printArray(T[] wordArray) 
	{
		int arraySize = wordArray.length;
		for (int index = 0; index < arraySize; index++) 
		{
			System.out.print(wordArray[index] + "  ");
		}
	}

	public static void main(String[] args) 
	{

		MergeSort<String> sort = new MergeSort<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of words: ");
		int arraySize = scanner.nextInt();
		String[] wordArray = new String[arraySize];

		System.out.println("Enter words:");
		for (int index = 0; index < arraySize; index++) 
		{
			String word = scanner.next();
			wordArray[index] = word;
		}
		

		System.out.println("The array of words are : ");
		sort.printArray(wordArray);
		sort.mergeSort(wordArray, 0, arraySize - 1);
		System.out.println();
		System.out.println("The sorted array is : ");
		sort.printArray(wordArray);

	}
}
