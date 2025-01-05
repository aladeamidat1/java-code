import java.util.Scanner;
	public class interestCalculator{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in); 

	System.out.println("Enter initial investment: $");
	int investment = input.nextInt();

	System.out.println("Enter monthly contribution: $");
	int monthlyContribution = input.nextInt();

	System.out.println("Enter length of time in years: ");
	int lengthOfTime = input.nextInt();
	
	System.out.println("Enter estimated interest rate: ");
	double estimatedInterest = input.nextDouble();

	System.out.println("""
	Select   Compound Frequency
	1. yearly
	2. Monthly
	3. Daily

""");
	int compoundFrequency = input.nextInt(); 

	if(compoundFrequency == 1){
	double totalAmount = investment * Math.pow(1 + estimatedInterest / 1 , 1 * lengthOfTime);
	 
	System.out.printf("Total amount: %.2f%n " , totalAmount);

	}if(compoundFrequency == 2){
	double totalAmount = investment * Math.pow(1 + estimatedInterest / 12 , 12 * lengthOfTime);

	System.out.printf("Total amount: %.2f%n " , totalAmount);

	}if(compoundFrequency == 3){
	double totalAmount = investment * Math.pow(1 + estimatedInterest / 365 , 365 * lengthOfTime);

	System.out.printf("Total amount: %.2f%n " , totalAmount);


	}





 
	

	

	






}






}