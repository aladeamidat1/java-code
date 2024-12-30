

public class Kata {

    public static Boolean isEven(int num){
        return num % 2 == 0;
    }

    public static Boolean isPrimeNumber(int num){
        if (num <= 1) {
            return false;
        }
        for (int n = 2; n <= Math.sqrt(num) ; n++) {
            if(num % n == 0){
                return false;
            }
        }
        return true;
    }

    public static int subtract(int num1, int num2){
        return Math.abs(num1-num2);
    }

    public static float divide(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        return (float) num1 / num2;
    }


    public static long squareOf(int num){

        return (long) num * num;
    }

    public static int factorOf(int num){
        int numOfFactor = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                numOfFactor ++;
            }
        }
        return numOfFactor;
    }

    public static boolean isSquare(int num){
        if(num < 0){
            return false;
        }
        int squareRoot = (int) Math.sqrt(num);

        return squareRoot * squareRoot == num;
    }

    public static boolean isPalindrome(int num){
        String string = String.valueOf(num);

        if (string.length() != 5){
            return false;
        }

        return string.equals(new StringBuilder(string).reverse().toString());
    }

    public static long factorialOf(int num){

        long result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }



    public static void main(String[] args){
        System.out.println(isEven(10));
        System.out.println(isEven(11));

        System.out.println(isPrimeNumber(23));
        System.out.println(isPrimeNumber(15));

        System.out.println(subtract(3,7));

        System.out.println(divide(3,8));
        System.out.println(divide(7,0));

        System.out.println(factorOf(12));

        System.out.println(squareOf(50000));

        System.out.println(isSquare(25));

        System.out.println(isPalindrome(5212));

        System.out.println(factorialOf(5));

    }

}

