//class decleration

public class Kata {



	public  boolean isEven( int number){
		return number % 2 == 0;
	}

	public  int subtract(int first , int second ){
	
		return Math.abs(first - second);
	
	}

	public float divide(int number , int number1){
		

	if ( number1 == 0) {
		return 0;
	}
	else{
	
	return number / number1;
	
	}
	}
 
	public long squareOf(int num){

		return (num * num);
	}

	public long factorialOf(int number){
		long sum = 1;


		for(int ameedah = 1; ameedah <=  number; ameedah++){

			 sum *= ameedah;
		} 


	
	return sum;

		
	}

	public boolean isPrimeNumber(int num){

	return num % 2 == 0;
	

	} 

	public int factorOf(int num){

		for(int n = 1; n <= num; n++){
			if(num % n == 0){
				System.out.println(n);
		
			}
			
		}

			return num;
	

	}

	public boolean isSquare(int num){

		return num * num;



	}
	




	
	

}

	



	






//return true if the number is even
//we declare our function
//specify the type of function
//we need to name our function
//since we re collecting a number we need to pass a dummy value to represent the actual number 
//check if the number is even
//we would check by dividing by 2 if it has no remainder we should return true else we should return false

// declare function
// declare name of function
//collect two numbers
//number should return positive value irrespective of the order the number is been input.

// declare function
// declare function name
// collect two integer
// when dividing, if the second integer is zero.the result must be zero.

// dec

