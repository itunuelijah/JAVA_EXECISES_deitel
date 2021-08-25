package chapter2;

import java.util.Scanner;

public class ThreeIntegers {
    public static void main(String[] args) {
        int sum;
        int average;
        int product;
        int smallest;
        int largest;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int number1 = scanner.nextInt();

        System.out.println("Enter number 2:");
        int number2 = scanner.nextInt();

        System.out.println("Enter number 3:");
        int number3 = scanner.nextInt();

        sum = number1 + number2 + number3;
        average =(number1 + number2 + number3)/ 3;
        product = number1 * number2 * number3;


        System.out.printf("Sum = %d%n", sum);
        System.out.printf("Average = %d%n", average);
        System.out.printf("Product = %d%n", product);

        if(number1 > number2 && number1 > number3){
            largest = number1;
            System.out.println(largest + " is the largest");
        } else
        if(number2 > number1 && number2 > number3){
            largest = number2;
            System.out.println(largest + " is the largest");
        } else
        if(number3 > number1 && number3 > number2) {
            largest = number3;
            System.out.println(largest + " is the largest");
        }

        if(number1 < number2 && number1 < number3){
            smallest = number1;
            System.out.println(smallest + " is the smallest");
        } else
        if(number2 < number1 && number2 < number3){
            smallest = number2;
            System.out.println(smallest + " is the smallest");
        } else
        if(number3 < number1 && number3 < number2) {
            smallest = number3;
            System.out.println(smallest + " is the smallest");

        }
    }

}
