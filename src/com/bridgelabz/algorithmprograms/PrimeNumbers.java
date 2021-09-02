package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
         int startRange, endRange;
         System.out.println( "Enter lower bound of the interval: ");
         startRange = scanner.nextInt(); 
         System.out.println( "Enter upper bound of the interval: ");
         endRange = scanner.nextInt();  
         System.out.println("Prime numbers between " + startRange+"and "+ endRange+" are:");
         findPrimeNumbers(startRange,endRange);
	}

	private static void findPrimeNumbers(int startRange , int endRange) 
	{
		int indexI,indexJ,flag,count=0;
		for (indexI = startRange; indexI <= endRange; indexI++) 
		{
			if (indexI == 1 || indexI == 0)
			{
				continue;
			}
            flag = 1;
            for (indexJ = 2; indexJ <= indexI / 2; indexJ++) 
            {
                if (indexI % indexJ == 0) 
                {
                    flag = 0;
                    break;
                }
            }
 
            if (flag == 1)
            {
            	System.out.println(indexI);
            	count++;
            }
                
		}
		System.out.println("Number of prime numbers in the given range is :"+ count);
	}

}
