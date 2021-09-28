package chapter2;

import java.util.Scanner;

public class TwoIntegers {
    public static void main(String[] args) {
        double sum;
        double product;
        double difference;
        double division;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        double number1 = scanner.nextInt();

        System.out.println("Enter number 2:");
        double number2 = scanner.nextInt();

        sum = number1 + number2;
        product = number1 * number2;
        difference = number1 - number2;
        division = number1 / number2;

        System.out.printf("Sum = %.2f%n", sum);
        System.out.printf("Product = %.2f%n", product);
        System.out.printf("Difference = %.2f%n", difference);
        System.out.printf("Division = %.2f%n", division);
    }
}
