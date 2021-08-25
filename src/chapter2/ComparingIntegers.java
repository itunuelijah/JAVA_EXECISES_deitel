package chapter2;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args){
        int number1;
        int number2;
        int heighest;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        number1 = scanner.nextInt();

        System.out.println("Enter second number:");
        number2 = scanner.nextInt();
        if(number1 > number2){
           heighest = number1;
            System.out.println(heighest + " is larger");
        } else
        if(number2 > number1){
            heighest = number2;
            System.out.println(heighest + " is larger");
        }
        else {
            System.out.println("These members are equal");
        }

    }
}
