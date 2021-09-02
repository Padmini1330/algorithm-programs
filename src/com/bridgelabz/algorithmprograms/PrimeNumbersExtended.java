package com.bridgelabz.algorithmprograms;

import java.util.Scanner;
import java.util.Arrays;

public class PrimeNumbersExtended 
{

	public static void main(String[] args) 
	{
		PrimeNumbersExtended primenumber=new PrimeNumbersExtended();
		Scanner sc = new Scanner(System.in);
        int startRange, endRange,i, j,flag;
        System.out.println( "Enter lower bound of the interval: ");
        startRange = sc.nextInt(); 
        System.out.println( "Enter upper bound of the interval: ");
        endRange = sc.nextInt();  
        System.out.println("Prime, Anagram and Palindrome numbers are: ");
        for(i=startRange;i<=endRange;i++)
        {
        	if(primenumber.isPrimeNumber(i))
        	{
        		for(j = i; j < endRange; j++) 
        		{
					if ((i != j) && (primenumber.isPrimeNumber(j))) 
					{
						if (primenumber.isAnagram(String.valueOf(i), String.valueOf(j)) && primenumber.isPalindrome(i)) 
						{
							System.out.println(i + "," + j );
						}
					}
        		}
			}
        }
	}
       
	public boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) 
		{
			return false;
		} 
		else 
		{
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) 
			{
				return true;
			}
		}
		return false;
	}

	public boolean isPrimeNumber(int number) 
	{
		if (number == 0 || number == 1) 
		{
			return false;
		}
		for (int index = 2; index < number; index++) 
		{
			if (number % index == 0) 
			{
				return false;
			}
		}
		return true;

	}

	public boolean isPalindrome(int number) 
	{
		int reverse, sum = 0;
		int temp = number;
		while (number > 0) 
		{
			reverse = number % 10;
			sum = (sum * 10) + reverse;
			number = number / 10;
		}
		if (temp == sum) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	


}
