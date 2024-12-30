public class TaskSix {
    public static void main(String [] args) {

        int num1 = 1;
        int num2 = 1;
        int Total;

        for (int number = 1; number <= 5; number++) {

            num1 = (num1 * 4);
            System.out.println(num1);
        }
        for (int number = 1; number <= 5; number++){

            num2 = num2 * 8;
            System.out.println(num2);
        }
        Total  = num1 + num2;
        System.out.println("Total of number "+ Total);


    }
}
