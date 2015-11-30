package fPPPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter any number to check Palindrome");
		
		Scanner yourInput = new Scanner(System.in);
		
		String input = yourInput.next();
		
		while(input.length() == 5){
			for(int i= 0, j = input.length(); i <input.length(), j>=0; i++, j--){
			
			if(i != j)
				break;	
			}
		}
	}
}
