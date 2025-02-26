import java.util.Scanner;
	public class pizzaWahala{
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			int sapasize = 4;
			int smallmoney = 6;
			int Bigboys = 8;
			int Odogwu =12;
	

			int sapasizeprice = 2500;
			int smallmoneyprice = 2900;
			int Bigboysprice = 4000;
			int Odogwuprice = 5200;

	System.out.println("how many people are eating the pizza");
		int numberOfPeople = input.nextInt();

	System.out.println("""
	select pizza type

	1. sapa size
	2. small money 
	3. Big boys
	4. Odogwu 
""");

	int pizzatype = input.nextInt();
	

	if(pizzatype == 1){ 

	System.out.println(numberOfPeople);
			int numberofboxes = (numberOfPeople + sapasize - 1) / sapasize;
			
		System.out.println("number of boxes " + numberofboxes);


	int totalslices = numberofboxes * sapasize;
	int leftoverslices = totalslices - numberOfPeople;
	System.out.println("leftoverslices " + leftoverslices);
	System.out.println(numberofboxes);
	System.out.println( numberofboxes * sapasizeprice);
	long totalprice = numberofboxes * sapasizeprice;
	System.out.println(totalprice);
	System.out.println("total price: " + totalprice);

	}if (pizzatype == 2){
			int numberofboxes = (numberOfPeople + smallmoney - 1) / smallmoney;
			
		System.out.println("number of boxes " + numberofboxes);

	int totalslices = numberofboxes * smallmoney;
	int leftoverslices = totalslices - numberOfPeople;
	System.out.println("leftoverslices " + leftoverslices);
	System.out.println("total price: " + numberofboxes * 2900);

	}if (pizzatype == 3){
			int numberofboxes = (numberOfPeople + Bigboys - 1) / Bigboys;
			
		System.out.println("number of boxes " + numberofboxes);

	int totalslices = numberofboxes * Bigboys;
	int leftoverslices = totalslices - numberOfPeople;
	System.out.println("leftoverslices " + leftoverslices);
	System.out.println("total price: " + numberofboxes * 4000);

	}if (pizzatype == 4){
			int numberofboxes = (numberOfPeople + Odogwu - 1) / Odogwu;

		System.out.println("number of boxes " + numberofboxes);

	int totalslices = numberofboxes * Odogwu;
	int leftoverslices = totalslices - numberOfPeople;
	System.out.println("leftoverslices " + leftoverslices);
	System.out.println("total price: " + numberofboxes * 5200);
 

	}

  