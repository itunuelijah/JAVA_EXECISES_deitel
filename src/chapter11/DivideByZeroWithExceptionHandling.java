package chapterEleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
   public static double quotient(int numerator, int denominator)
   throws ArithmeticException
   {
       return numerator/denominator;
   }
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       boolean continueloop = true;
       do{
           try{
               System.out.print("Please enter an integer numerator: ");
               int numerator = scanner.nextInt();
               System.out.print("Please enter an integer denominator: ");
               int denominator = scanner.nextInt();
               double result = quotient(numerator, denominator);
               System.out.println( "Result:"+ numerator +"/"+ denominator +"="+ result);
               continueloop = false;
           }
           catch (InputMismatchException inputMismatchException){
               System.err.println("Exception: " + inputMismatchException);
               scanner.nextLine();
               System.out.println("You must enter integers, please try again.");
           }
           catch (ArithmeticException arithmeticException) {
               System.err.println("Exception: " + arithmeticException);
               System.out.println("Zero is an invalid denominator, please try again");
           }
       } while (continueloop);
   }
}



