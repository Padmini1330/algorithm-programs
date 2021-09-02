package com.bridgelabz.algorithmprograms;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramDetection 
{
	public void isAnagram(String firstString,String secondString) 
	{  
       
		firstString = firstString.toLowerCase();  
        secondString = secondString.toLowerCase();  
    
        if (firstString.length() != secondString.length()) 
        {  
            System.out.println("Entered Strings are not Anagram!");  
        }  
        else 
        {  
            
            char[] string1 = firstString.toCharArray();  
            char[] string2 = secondString.toCharArray();  
    
            Arrays.sort(string1);  
            Arrays.sort(string2);  
  
      
            if(Arrays.equals(string1, string2) == true) 
            {  
                System.out.println("Both the entered strings are anagram!");  
            }  
            else 
            {  
                System.out.println("Both the entered strings are not anagram!");  
            }  
        }  
	}
	
	public static void main(String[] args) {
		AnagramDetection anagram=new AnagramDetection();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings:");
		String firstString=scanner.nextLine();
		String secondString=scanner.nextLine();
		anagram.isAnagram(firstString,secondString);

	}

}
