package com.bridgelabz.algorithmprograms;

import java.util.Scanner;
import java.util.Arrays;

public class PrimeAnagramAndPalindrome 
{

	public static void main(String[] args) 
	{
		PrimeAnagramAndPalindrome primenumber=new PrimeAnagramAndPalindrome();
		Scanner scanner = new Scanner(System.in);
        int startRange, endRange,number, index,flag;
        System.out.println( "Enter lower bound of the interval: ");
        startRange = scanner.nextInt(); 
        System.out.println( "Enter upper bound of the interval: ");
        endRange = scanner.nextInt();  
        System.out.println("Prime, Anagram and Palindrome numbers are: ");
        for(number=startRange;number<=endRange;number++)
        {
        	if(primenumber.isPrimeNumber(number))
        	{
        		for(index = number; index < endRange; index++) 
        		{
					if ((number != index) && (primenumber.isPrimeNumber(index))) 
					{
						if (primenumber.isAnagram(String.valueOf(number), String.valueOf(index)) && primenumber.isPalindrome(number)) 
						{
							System.out.println(number + "," + index );
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
