package chapter7;

import java.util.Scanner;

public class StudentScoreCollection {
    public static void main(String[] args) {
        collectingData();


    }

    public static void collectingData() {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int average = 0;

        System.out.println("Enter number of students:");
        int students = input.nextInt();
        System.out.println("Enter number of subjects:");
        int subjects = (input.nextInt());
        int[][] grade = new int[students][subjects];
        for (int i = 0; i <= grade.length-1; i++) {
            System.out.print("For student " + (i + 1) + ", ");
            for (int j = 0; j <= grade[i].length-1; j++) {
                System.out.println("enter grade " + (j + 1) + ":");
                grade[i][j] = input.nextInt();
                total = total + grade[i][j];
            };
             average = total/grade.length;
        }
        System.out.print("\t\t\t\t");
        for (int i = 0; i < subjects; i++) {
            System.out.print("\t"+"Sub "+(i+1));
        }
        System.out.print("\n");
        System.out.print("\t\t\t ");
        for (int i = 0; i < subjects; i++) {
            System.out.print("----------------");
        }
        System.out.print("\n");
            for (int i = 0; i < grade.length; i++) {
                System.out.print("Students " + (i + 1) + " | ");

                for (int j = 0; j < grade[i].length; j++) {
                    System.out.print("\t\t" + grade[i][j] );
                }
                System.out.print("\t\t" + total + "\t\t");
                System.out.print(average);
                System.out.println();
            }



    }
}









































