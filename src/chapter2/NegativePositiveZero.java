package chapter2;

import java.util.Scanner;

public class NegativePositiveZero {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        number2 = scanner.nextInt();
        System.out.println("Enter third number:");
        number3 = scanner.nextInt();
        System.out.println("Enter forth number:");
        number4 = scanner.nextInt();
        System.out.println("Enter fifth number:");
        number5 = scanner.nextInt();


            if ((number1 < 0 && number2 < 0 && number3 < 0 && number4 < 0 && number5 >= 0) ||
                    (number1 < 0 && number2 < 0 && number3 < 0 && number4 >= 0 && number5 < 0) ||
                    (number1 < 0 && number2 < 0 && number3 >= 0 && number4 < 0 && number5 < 0) ||
                    (number1 < 0 && number2 >= 0 && number3 < 0 && number4 < 0 && number5 < 0) ||
                    (number1 >= 0 && number2 < 0 && number3 < 0 && number4 < 0 && number5 < 0)) {

                System.out.println("Negative numbers input = 4");
            }
            if ((number1 <= 0 && number2 <= 0 && number3 <= 0 && number4 <= 0 && number5 > 0) ||
                    (number1 <= 0 && number2 <= 0 && number3 <= 0 && number4 > 0 && number5 <= 0) ||
                    (number1 <= 0 && number2 <= 0 && number3 > 0 && number4 <= 0 && number5 <= 0) ||
                    (number1 <= 0 && number2 > 0 && number3 <= 0 && number4 <= 0 && number5 <= 0) ||
                    (number1 > 0 && number2 <= 0 && number3 <= 0 && number4 <= 0 && number5 <= 0)) {

                System.out.println("Positive numbers input = 1");
                System.out.print("Zero numbers input = 0 ");
            }

        if ((number1 >= 0 && number2 >= 0 && number3 >= 0 && number4 >= 0 && number5 < 0) ||
                (number1 >= 0 && number2 >= 0 && number3 >= 0 && number4 < 0 && number5 >= 0) ||
                (number1 >=0 && number2 >= 0 && number3 < 0 && number4 >= 0 && number5 >=0) ||
                (number1 >= 0 && number2 < 0 && number3 >=0 && number4 >= 0 && number5 >=0) ||
                (number1 < 0 && number2 >= 0 && number3 >= 0 && number4 >= 0 && number5 >= 0)) {

            System.out.println("Negative numbers input = 1");
        }
        if ((number1 > 0 && number2 > 0 && number3 > 0 && number4 > 0 && number5 <= 0) ||
                (number1 > 0 && number2 > 0 && number3 > 0 && number4 <= 0 && number5 > 0) ||
                (number1 > 0 && number2 > 0 && number3 <= 0 && number4 > 0 && number5 > 0) ||
                (number1 > 0 && number2 <= 0 && number3 > 0 && number4 > 0 && number5 > 0) ||
                (number1 <= 0 && number2 > 0 && number3 > 0 && number4 > 0 && number5 > 0)) {

            System.out.println("Positive numbers input = 4");
            System.out.print("Zero numbers input = 0 ");
        }









        if ((number1 < 0 && number2 < 0 && number3 < 0 && number4 >= 0 && number5 >= 0) ||
                    (number1 < 0 && number2 < 0 && number4 < 0 && number3 >= 0 && number5 >= 0) ||
                    (number1 < 0 && number2 < 0 && number5 < 0 && number4 >= 0 && number3 >= 0) ||
                    (number1 < 0 && number3 < 0 && number2 < 0 && number5 >= 0 && number4 >= 0) ||
                    (number1 < 0 && number3 < 0 && number4 < 0 && number2 >= 0 && number5 >= 0) ||
                    (number1 < 0 && number3 < 0 && number5 < 0 && number4 >= 0 && number2 >= 0) ||
                    (number1 < 0 && number4 < 0 && number2 < 0 && number3 >= 0 && number5 >= 0) ||
                    (number1 < 0 && number4 < 0 && number3 < 0 && number2 >= 0 && number5 >= 0) ||
                    (number1 < 0 && number4 < 0 && number5 < 0 && number2 >= 0 && number3 >= 0) ||
                    (number1 < 0 && number5 < 0 && number2 < 0 && number4 >= 0 && number3 >= 0) ||
                    (number1 < 0 && number5 < 0 && number3 < 0 && number4 >= 0 && number2 >= 0) ||
                    (number1 < 0 && number5 < 0 && number4 < 0 && number2 >= 0 && number3 >= 0) ||
                    (number2 < 0 && number3 < 0 && number4 < 0 && number1 >= 0 && number5 >= 0) ||
                    (number2 < 0 && number3 < 0 && number5 < 0 && number4 >= 0 && number1 >= 0) ||
                    (number3 < 0 && number4 < 0 && number5 < 0 && number1 >= 0 && number2 >= 0) ||
                    (number4 < 0 && number2 < 0 && number5 < 0 && number1 >= 0 && number3 >= 0)) {
                System.out.println("Negative numbers input = 3");
            }
            if ((number1 <= 0 && number2 <= 0 && number3 <= 0 && number4 > 0 && number5 > 0) ||
                    (number1 <= 0 && number2 <= 0 && number4 <= 0 && number3 > 0 && number5 > 0) ||
                    (number1 <= 0 && number2 <= 0 && number5 <= 0 && number4 > 0 && number3 > 0) ||
                    (number1 <= 0 && number3 <= 0 && number2 <= 0 && number5 > 0 && number4 > 0) ||
                    (number1 <= 0 && number3 <= 0 && number4 <= 0 && number2 > 0 && number5 > 0) ||
                    (number1 <= 0 && number3 <= 0 && number5 <= 0 && number4 > 0 && number2 > 0) ||
                    (number1 <= 0 && number4 <= 0 && number2 <= 0 && number3 > 0 && number5 > 0) ||
                    (number1 <= 0 && number4 <= 0 && number3 <= 0 && number2 > 0 && number5 > 0) ||
                    (number1 <= 0 && number4 <= 0 && number5 <= 0 && number2 > 0 && number3 > 0) ||
                    (number1 <= 0 && number5 <= 0 && number2 <= 0 && number4 > 0 && number3 > 0) ||
                    (number1 <= 0 && number5 <= 0 && number3 <= 0 && number4 > 0 && number2 > 0) ||
                    (number1 <= 0 && number5 <= 0 && number4 <= 0 && number2 > 0 && number3 > 0) ||
                    (number2 <= 0 && number3 <= 0 && number4 <= 0 && number1 > 0 && number5 > 0) ||
                    (number2 <= 0 && number3 <= 0 && number5 <= 0 && number4 > 0 && number1 > 0) ||
                    (number3 <= 0 && number4 <= 0 && number5 <= 0 && number1 > 0 && number2 > 0) ||
                    (number4 <= 0 && number2 <= 0 && number5 <= 0 && number1 > 0 && number3 > 0)) {
                System.out.println("Positive numbers input = 2");
            }
        if (number1 == 0 && number2 == 0 && number3 == 0 && number4 == 0 && number5 == 0) {


            System.out.println("Number of negative numbers input = 0 ");
            System.out.println("Number of positive numbers input = 0 ");
            System.out.println("Number of zero numbers input = 5");

        }  if (number1 < 0 && number2 < 0 && number3 < 0 && number4 < 0 && number5 < 0) {

            System.out.println("Number of negative numbers input = 5 ");
            System.out.println("Number of positive numbers input = 0 ");
            System.out.println("Number of zero numbers input = 0");

        }
        if (number1 > 0 && number2 > 0 && number3 > 0 && number4 > 0 && number5 > 0) {
            System.out.println("Number of negative numbers input = 0 ");
            System.out.println("Number of positive numbers input = 5");
            System.out.println("Number of zero numbers input = 0");
        }


        }
    }

