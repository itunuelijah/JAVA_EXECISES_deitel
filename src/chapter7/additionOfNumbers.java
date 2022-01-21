package chapter7;

import java.util.Scanner;

public class additionOfNumbers {
    public static void main(String[] args) {
        System.out.print("How many numbers: ");
        Scanner input = new Scanner(System.in);
        int numberSize = input.nextInt();
        int[] number = new int[numberSize];
    }
    public int calculateMaximumFrom(int[] number){
        int maximumNumber = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > maximumNumber) {
                maximumNumber = number[i];
            }
        }
        return maximumNumber;
    }


        public int calculateMinimumFrom(int[] number) {
            int minimumNumber = number[0];
            for (int i = 0; i < number.length; i++) {
                if (number[i] < minimumNumber) {
                    minimumNumber = number[i];
                }
            }
            System.out.println("Maximum score is:" + minimumNumber);

            return minimumNumber;
        }
}