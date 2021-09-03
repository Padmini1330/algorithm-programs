package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class FindYourNumber 
{
	
	 Scanner scanner = new Scanner(System.in);
	 public static void main(String[] args) 
	    {
	        int low = 0;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("enter the number");
	        int number = scanner.nextInt();

	        int high = (int) Math.pow(2, number);
	        FindYourNumber findYourNumber = new FindYourNumber();
	        findYourNumber.findYourNumber(low, high);

	    }
	    public void findYourNumber(int low, int high) 
	    {

	        int middle = (high + low) / 2;

	        if (high <= low) 
	        {
	            System.out.println("Is the number even ?");
	            char clue = scanner.next().charAt(0);
	            if (clue == 'Y' || clue == 'y') {

	                System.out.println("Guessed number is: " + high);

	            } 
	            else 
	            {
	                System.out.println("Guessed number is: " + (low + 1));
	            }
	        } 
	        else 
	        {
	            System.out.println("Is your number between " + low + " and " + middle  + " : ");
	            char clue = scanner.next().charAt(0);

	            if (clue == 'y' || clue == 'Y') 
	            {
	                findYourNumber(low, middle - 1);
	            } 
	            else 
	            {
	                findYourNumber(middle + 1, high);
	            }
	        }
	    }   	    
}

