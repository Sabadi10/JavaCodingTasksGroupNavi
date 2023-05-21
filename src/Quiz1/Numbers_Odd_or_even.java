package Quiz1;

import java.util.Scanner;

public class Numbers_Odd_or_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number  ");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }

    }
}
