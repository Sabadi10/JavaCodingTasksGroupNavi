package Quiz1;

public class Finra {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("FINRA");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fin");
                } else if (i % 5 == 0) {

                    System.out.println("RA");
                }

            } else {
                System.out.println(i);
            }
        }

    }
   /* Numbers-  Odd or even:
    Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"

    NDivide without / operator:numbers -
    Write a method that can divide two numbers without using division operator

    FINRA:
    Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    print "FIN" instead of the number

    and for numbers which are a multiple of 5, print "RA" instead of the number.

    For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number
*/
}






