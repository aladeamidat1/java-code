public class KataFunctions{
	public static void main(String [] args){

	Kata ameedah = new Kata();

	
	boolean result = ameedah.isEven(9);
	System.out.println("is this number even? " + result);


	
	int result1 = ameedah.subtract(2,6);
	System.out.println("the result is:  " + result1);


	float result3 = ameedah.divide(10,10);
	System.out.println("the result is: " + result3);

	long result2 = ameedah.squareOf(5);
	System.out.println("the result is: " + result2);

	long result4 = ameedah.factorialOf(5);
	System.out.println("the result is: " + result4);
	
	boolean total = ameedah.isPrimeNumber(11);
	System.out.println("is this number prime number? : " + total);

	int total1 = ameedah.factorOf(10);
	System.out.println("the total is: " + total1);

	boolean total2 = ameedah.isSquare(25);
	System.out.println("the result is: " + total2);



}




}