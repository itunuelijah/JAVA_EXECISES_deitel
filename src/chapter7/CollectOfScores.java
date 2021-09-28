package chapter7;

import java.util.Scanner;

public class CollectOfScores {

    public static void main(String[] args) {
    System.out.print("How many scores to enter: ");
        Scanner input = new Scanner(System.in);
        int scoreSize = input.nextInt();
        int[] grades = new int[scoreSize];


for (int grade: grades){
    System.out.print(grade + " ");
}
        int maximum = 0;
        int minimum = 0;
        for (int counter = 1; counter < array.length; counter++) { score = input.nextInt();

            if (maximum < array[counter]) {
                maximum = array[counter];
            }
        }
            System.out.println("Maximum score is:" + maximum);
        }
    }

     /**   for (int counter = 0; counter < scores; counter++) {
            array[counter] = input.nextInt();
            if (minimum < array[scores]) {
                minimum = array[scores];
            }
        }
        System.out.println("Minimum score is:" + minimum);
    }

        }
*/




