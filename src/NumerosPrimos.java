import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        System.out.println("iingrese el numero a verificar");
      /**  while (number != 0) {
            number = scnr.nextInt();
            System.out.printf("esto %d es primo?  %s %n", number, isPrime(number));
           } **/
        if (number!=0){

            number=scnr.nextInt();
            System.out.printf("esto %d es primo?  %s %n", number, isPrime(number));
        }

        }
        public static boolean isPrime(int number){
            int sqrt = (int) Math.sqrt(number) + 1;
            for (int i = 2; i < sqrt; i++) {

                if (number % i == 0) {
                    // number is perfectly divisible - no prime
                    return false;
                }
            }
            return true;

        }


}
