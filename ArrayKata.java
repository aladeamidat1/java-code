public class ArrayKata{

	public int maximumIn(int[]arrayofinteger){
	int largest = arrayofinteger[0];

		for(int number : arrayofinteger){
			if (number > largest){
				largest = number;
			}

		}

		return largest;

		}

	public int minimumIn(int[]arrayofinteger){
	int smallest = arrayofinteger[0];

		for(int number : arrayofinteger){
			if(number < smallest){
				number = smallest;

			}

 
		}
		
		return smallest;

		}

	public int sumOf(int[]arrayofinteger){
	int total = arrayofinteger[0];
	
		for(int number : arrayofinteger){
			total += number;
			
		}
		
		return total;
	}

	public int sumOfEvenNumber(int[]arrayofinteger){
	int addition  = arrayofinteger[0];

		for(int number : arrayofinteger){
			if (number % 2 == 0){
				addition += number;

			}


		}

		return addition;	
	}

	public int sumOfOddNumber(int[]arrayofinteger){
	int sum = arrayofinteger[0];

		for(int number : arrayofinteger){
			if(number % 2 != 0){
				sum += number;

			}

		}
		return sum;
		
	}

	public int maximunAndMinimumOf(int[]arrayofinteger){
	int max = arrayofinteger[0];
	int min = arrayofinteger[0];

		for(int number : arrayofinteger){
			if(number > max){
				max = number;
			}else{
			min = number;
			}
			
		}
		return new int (min , max);   
		
	} 
	


}
























































































		
	

	


	




























