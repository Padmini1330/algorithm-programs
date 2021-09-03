package com.bridgelabz.algorithmprograms;

import java.util.Scanner;
import java.util.ArrayList;

public class StringPermutation 
{

	public static void stringRecursion(String word, String permutationWord) 
	{

		if (word.length() == 0) 
		{
			System.out.print(permutationWord + " ");
			return;
		}

		for (int index = 0; index < word.length(); index++) 
		{
			char charI = word.charAt(index);
			String restOfString = word.substring(0, index) + word.substring(index + 1);
			stringRecursion(restOfString, permutationWord + charI);
		}
	}

	
	public static void stringIteration(String word) 
	{

		int size=word.length();
		int factorial=factorial(size);
		
		for(int index=0;index<factorial;index++)
		{
			StringBuilder sb=new StringBuilder(word);
			int temp=index;
			for(int div=size;div>=1;div--)
			{
				int quotient=temp/div;
				int rem=temp%div;
				System.out.print(sb.charAt(rem));
				sb.deleteCharAt(rem);
				temp=quotient;
			}
			System.out.print(" ");
		}

	}
	
	private static int factorial(int size) {
		int value=1;
		for(int index=2;index<=size;index++)
		{
			value*=index;
		}
		return value;
	}


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the String To Permutate:");
		String word = scanner.next();

		System.out.println("Permutation by Iterating : ");
		stringIteration(word);
		
		System.out.println();
		System.out.println("Permutation by Recursion : ");
		stringRecursion(word, "");

	}
}
