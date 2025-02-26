import java.util.Scanner;

public class practice1{
	public static void main(String [] args){

	int number = (int)(Math.random() * 101);

	Scanner input = new Scanner(System.in);

	System.out.println("Guess a magic number between 0 and 100");

	System.out.print("\nEnter your guess: ");
	int guess = input. nextInt();

	if (guess == number)
		System.out.println("yes, the number is " + number);
	
	else if (guess > number)
		System.out.println("Your guess is too high");
		else
			System.out.println("Your guess is too low");

	while (true) {
		System.out.print("\nEnter your guest: ");
		guess = input.nextInt();

	if (guess == number)
		System.out.println("yes, the number is " + number);
	
	else if (guess > number)
		System.out.println("Your guess is too high");
		else
			System.out.println("Your guess is too low");
	}

	while (guess != number){

	System.out.print("\nEnter your guess: ");
	guess = input.nextInt();

	if (guess == number)
		System.out.println("yes, the number is " + number);
	
	else if (guess > number)
		System.out.println("Your guess is too high");
		else
			System.out.println("Your guess is too low");
	}
	
	int guess = -1;
	while (guess != number) {

	System.out.print("\nEnter your guess: ");
	guess = input.nextInt();

	if (guess == number)
		System.out.println("yes, the number is " + number);
	
	else if (guess > number)
		System.out.println("Your guess is too high");
		else
			System.out.println("Your guess is too low");

	}


	





	

	









		












}


}

//int count = 0;
	//while (count < 100) {
		//System.out.println("Welcome to java!");
		//count++;
	//}

	//for (int count = 0; count < 100; count++){
		//System.out.println("Welcome to java!");

	//}
	

