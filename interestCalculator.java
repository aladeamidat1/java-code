	import java.util.Scanner;
public class InterestCalculator{

		public static void main(String[] args){

		Scanner input = new Scanner(System.in); 
int investment;
do {
	System.out.println("Enter initial investment: ");
	investment = input.nextInt();
	if (investment <= 0 ) {
	System.out.println("Invalid Input \nKindly enter again ");
	} 
}while(investment <= 0);

int years;
do {
	System.out.println("Enter length of time in years: ");
	years = input.nextInt();
	if (years <= 0 ) {
	System.out.println("Invalid Input \nKindly enter again ");
	}
}while(years <= 0);


double estimatedInterest;
do {
	System.out.println("Enter estimated interest rate: ");
	estimatedInterest = input.nextDouble();
	if (estimatedInterest <= 0 ) {
	System.out.println("Invalid Input \nKindly enter again ");
	}
}while(estimatedInterest <= 0);
	

	System.out.println("""
	Select   Compound Frequency
	1. Annually
	2. Semiannually
	3. Quarterly
	4. Monthly
	5. Daily

""");
	int compoundFrequency = input.nextInt(); 

	if(compoundFrequency == 1){
		int Annually  = 1;

	double totalAmount = investment * Math.pow(1 + estimatedInterest / 100  / Annually , Annually * years);
	 
	System.out.printf("Total amount: %.2f%n " , totalAmount);

	} else if(compoundFrequency == 2){
		int Semiannually = 2;
	double totalAmount = investment * Math.pow(1 + estimatedInterest / 100 / Semiannually , Semiannually * years);

	System.out.printf("Total amount: %.2f%n " , totalAmount);

	} else if(compoundFrequency == 3){
		int Quarterly = 4;
	double totalAmount = investment * Math.pow(1 + estimatedInterest / 100 / Quarterly , Quarterly * years);

	System.out.printf("Total amount: %.2f%n " , totalAmount);
 
	}else if(compoundFrequency == 4){
		int Monthly = 12;
	double totalAmount = investment * Math.pow(1 + estimatedInterest / 100 / Monthly , Monthly * years);

	System.out.printf("Total amount: %.2f%n " , totalAmount);

	}else if(compoundFrequency == 5){
		int Daily = 365;
	double totalAmount = investment * Math.pow(1 + estimatedInterest / 100 / Daily , Daily * years);

	System.out.printf("Total amount: %.2f%n " , totalAmount);


	} else{

	System.out.println("Invalid selection , please choose a valid option (1 - 5)");
}
	System.out.println();



	
}






}