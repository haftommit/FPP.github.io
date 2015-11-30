package fPPPrograms;

import java.util.Scanner;

public class WeightInPlanet {

	public static void main(String[] args) {
		
		System.out.println("Enter Your Choice(1-6) to know your weight in any of the planets! ");
		
		Scanner yourInput = new Scanner(System.in);
		
		int input = yourInput.nextInt();
		double weight = 0.0;
		
		switch(input){
		case 1:
			weight = input * 0.78;
			System.out.println("Your Weight @Planet Venus is:" +weight);
			break;
		case 2:
			weight = input * 2.65;
			System.out.println("Your Weight @Planet Jupiter is:" +weight);
			break;
		case 3:
			weight = input*0.39;
			System.out.println("Your Weight @Planet Mars is:" +weight);
			break;
		case 4:
			weight = input*1.17;
			System.out.println("Your Weight @Planet Saturn is:" +weight);
			break;
		case 5:
			weight = input*1.05;
			System.out.println("Your Weight @Planet Uranus is:" +weight);
			break;
		case 6:
			weight = input*1.23;
			System.out.println("Your Weight @Planet Neptus is:" +weight);
			break;
		default:
			System.out.println("Your Inpute is Wrong! Please Try Again:");
			break;
		}
		

	}

}
