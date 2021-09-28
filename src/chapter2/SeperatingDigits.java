package chapter2;

import java.util.Scanner;

public class SeperatingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five digits number:");
        int number = scanner.nextInt();
        int remainder1 = number%10;
        int division1 = number/10;
        int remainder2 = division1%10;
        int division2 = division1/10;
        int remainder3 = division2%10;
        int division3 = division2/10;
        int remainder4 = division3%10;
        int division4 = division3/10;
        int remainder5 = division4%10;
        int division5 = division4/10;

        System.out.print(remainder5 +" ");
         System.out.print(remainder4 +" ");
         System.out.print(remainder3 +" ");
         System.out.print(remainder2 +" ");
         System.out.println(remainder1 +" ");

    }
}
