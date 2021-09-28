package chapter2;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int remainder = number % 2;
        if (remainder == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }


    }
}
