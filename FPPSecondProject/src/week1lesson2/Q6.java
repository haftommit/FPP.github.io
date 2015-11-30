package fPPPrograms;

import java.util.Scanner;

public class Checkerboard {

	public static void main(String[] args) {
		
		System.out.println("Enter a number ");
		
		Scanner input = new Scanner(System.in);
		
		int yourInput = input.nextInt();
		
		for(int i = 0; i <yourInput; i++){
			for(int j = 0; j < yourInput; j++){
				System.out.print("*");
			}
			System.out.println("*");
		}
			

	}

}
