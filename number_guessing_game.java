package exercices;

import java.util.*;

public class number_guessing_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("WELCOME TO THE NUMBER GUESSING GAME");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose your range:\n1) 1 to 100\n2) 1 to 1000");
		int selection = sc.nextInt();
		
		if (selection == 1) {
			Random rand1 = new Random();
			int randomNumber1= rand1.nextInt(100)+1;
			System.out.println("Please enter your number: ");
			int number1 = sc.nextInt();
			
			if (number1==randomNumber1) {
				System.out.println("your number was: " + number1);
				System.out.println("my number was: " +randomNumber1);
				System.out.println("YOU WIN");
			}
			else {
				System.out.println("your number was: " + number1);
				System.out.println("my number was: " +randomNumber1);
				System.out.println("YOU LOST");
			}
			
		}
		
		else if(selection ==2) {
			Random rand2 = new Random();
			int randomNumber2= rand2.nextInt(1000)+1;
			System.out.println("Please enter your number: ");
			int number2= sc.nextInt();
			
			if (number2 == randomNumber2) {
				System.out.println("your number was: " + number2);
				System.out.println("my number was: " +randomNumber2);
				System.out.println("YOU WIN");	
			}
			else {
				System.out.println("your number was: " + number2);
				System.out.println("my number was: " +randomNumber2);
				System.out.println("YOU LOST");
			}
		}
		else {
			System.out.println("please select 1 or 2");
		}
		
		

	}

}
