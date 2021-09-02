package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class FindYourNumber 
{
	
	 Scanner sc = new Scanner(System.in);
	 public static void main(String[] args) 
	    {
	        int low = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the number");
	        int n = sc.nextInt();

	        int high = (int) Math.pow(2, n);
	        FindYourNumber findYourNumber = new FindYourNumber();
	        findYourNumber.findYourNumber(low, high);

	    }
	    public void findYourNumber(int low, int high) 
	    {

	        int mid = (high + low) / 2;

	        if (high <= low) 
	        {
	            System.out.println("Is the number even ?");
	            char ch = sc.next().charAt(0);
	            if (ch == 'Y' || ch == 'y') {

	                System.out.println("Guessed number is: " + high);

	            } 
	            else 
	            {
	                System.out.println("Guessed number is: " + (low + 1));
	            }
	        } 
	        else 
	        {
	            System.out.println("Is your number between " + low + " and " + mid + " : ");
	            char ch = sc.next().charAt(0);

	            if (ch == 'y' || ch == 'Y') 
	            {
	                findYourNumber(low, mid - 1);
	            } 
	            else 
	            {
	                findYourNumber(mid + 1, high);
	            }
	        }
	    }   	    
}

