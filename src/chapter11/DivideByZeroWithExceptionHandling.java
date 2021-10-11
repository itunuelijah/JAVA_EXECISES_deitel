package chapterEleven;

import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
   public static double quotient(int numerator, int denominator){
       return numerator/denominator;
   }
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Please enter an integer numerator: ");
       int numerator = scanner.nextInt();
       System.out.print("Please enter an integer denominator: ");
       int denominator = scanner.nextInt();
       double result = quotient(numerator, denominator);
       System.out.println( result);
       }
    }



