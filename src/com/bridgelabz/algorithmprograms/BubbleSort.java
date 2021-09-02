package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class BubbleSort 
{
	public void bubbleSort(Integer[] numberArray) {

		int arraySize = numberArray.length;

		for (int indexI = 0; indexI < arraySize - 1; indexI++) 
		{
			for (int indexJ = 0; indexJ < arraySize - indexI - 1; indexJ++) 
			{
				if (numberArray[indexJ].compareTo(numberArray[indexJ + 1]) > 0) 
				{
					Integer tempNumber = numberArray[indexJ];
					numberArray[indexJ] = numberArray[indexJ + 1];
					numberArray[indexJ + 1] = tempNumber;
				}
			}
		}
		System.out.println("The sorted array is : ");
		printArray(numberArray);
	}

	public void printArray(Integer[] numberArray) 
	{
		int arraySize = numberArray.length;
		for (int index = 0; index < arraySize; index++) 
		{
			System.out.print(numberArray[index] + " ");
		}
	}

	public static void main(String[] args) {

		BubbleSort sort = new BubbleSort();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int arraySize = scanner.nextInt();
		Integer[] numberArray = new Integer[arraySize];

		System.out.println("Enter numbers");
		for (int index = 0; index < arraySize; index++) 
		{
			Integer number = scanner.nextInt();
			numberArray[index] = number;
		}
		

		System.out.println("The array of numbers are[unsorted] : ");
		sort.printArray(numberArray);
		
		System.out.println("");
		sort.bubbleSort(numberArray);

	}
}

