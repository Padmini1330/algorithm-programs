package com.bridgelabz.algorithmprograms;

import java.util.Scanner;
import java.util.ArrayList;

public class BinarySearch<T extends Comparable<T>> 
{
	public int binarySearch(ArrayList<T> arrayList, int low, int high, T key) 
	{
		if (low<=high) 
		{
			int middle = (low + high) / 2;
			if (arrayList.get(middle).equals(key)) 
			{
				return middle;
			}
			if (arrayList.get(middle).compareTo(key) > 0) 
			{
				binarySearch(arrayList, low, middle - 1, key);
			}
			binarySearch(arrayList, middle + 1, high, key);
		}
		return -1;
	}

	public static void main(String[] args) {

		BinarySearch<String> search = new BinarySearch<String>();
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<String>();
		
		System.out.println("Enter the number of words: ");
		int listSize = scanner.nextInt();
		
		System.out.println("Enter words:");
		for (int index = 0; index < listSize; index++) 
		{
			String word = scanner.next();
			arrayList.add(word);
		}

		System.out.println("Enter the word to be searched: ");
		String searchElement = scanner.next();
		System.out.println("The arrayList of words are : " + arrayList);
		int index = search.binarySearch(arrayList, 0, listSize - 1, searchElement);
		if(index==-1)
			System.out.println("Searched word not found!");
		else
			System.out.println("Word *" + searchElement + "* found at index: " + index);

	}
}

