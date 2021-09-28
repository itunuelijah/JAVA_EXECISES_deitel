package chapter2;

import java.util.Scanner;
public class TwoIntegersMultiples {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number:");
            int number1 = scanner.nextInt();
            System.out.println("Enter second number:");
            int number2 = scanner.nextInt();
            int remainder = number1 % number2;
            if (remainder == 0) {
                System.out.println("First is the multiple of the second\n" + "Answer = " + remainder);
            }
        }
}
