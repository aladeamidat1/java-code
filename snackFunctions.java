import java.util.Scanner;

	public class snackFunctions{

		public static void main(String[] args){

			Scanner input = new Scanner(System.in);
int ridersDelivery;
				do {
				System.out.println("what is the percentage of riders successful delivery: ");
				ridersDelivery = input.nextInt();
				if (ridersDelivery <= 0) {
				System.out.println("Invalid Input");
				}} while(ridersDelivery <= 0);
				
				int perparcel1 = 160;
				int perparcel2 = 200;
				int perparcel3 = 250;
				int perpercel4 = 500;
				int basepay = 5000;
				int totalwages =0;

		if(ridersDelivery < 50){
			 totalwages = ridersDelivery * 160 + 5000 ;
		}

		else if(ridersDelivery >= 50 && ridersDelivery <= 59){
			totalwages = ridersDelivery * 200 + 5000;
		}

		else if(ridersDelivery >= 60 && ridersDelivery <= 69){
			totalwages = ridersDelivery * 250 + 5000;
		}

		else if(ridersDelivery >= 70){
			totalwages = ridersDelivery * 500 + 5000;
		}			

		System.out.print("totalwages" + totalwages );



}






}

	