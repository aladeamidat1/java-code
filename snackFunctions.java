import java.util.Scanner;

	public class snackFunctions{

		public static void main(String[] args){

			Scanner input = new Scanner(System.in);

				System.out.println("what is the percentage of riders successful delivery");
					int ridersDelivery = input.nextInt();

				
				int i = 160;
				int n = 200;
				int y = 250;
				int z = 500;
				int basepay = 5000;

		if(ridersDelivery < 50){
			int total = ridersDelivery * 160 + 5000 ;
		System.out.print("total" + total );

		}

		if(ridersDelivery >= 50 && ridersDelivery <= 59){
			int total = ridersDelivery * 200 + 5000;
		System.out.print("total" + total );

		}

		if(ridersDelivery >= 60 && ridersDelivery <= 69){
			int total = ridersDelivery * 250 + 5000;
		System.out.print("total" + total );

		}

		if(ridersDelivery >= 70){
			int total = ridersDelivery * 500 + 5000;
		System.out.print("total" + total );

		}

			





}






}

	