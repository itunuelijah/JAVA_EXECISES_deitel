package chapter5;

import java.util.Scanner;

public class LetterGrades {

    public static void main(String[] args) {
        int total =0;
        int gradeCounter = 0 ;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the integer grades in the range 0-100");
        while(gradeCounter < 5){
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;

            switch (grade/10){
                case 9:
                case 10:
                    ++aCount;
                    break;

                case 8:
                    ++bCount;
                    break;

                case 7:
                    ++cCount;
                    break;

                case 6:
                    ++dCount;
                    break;

                default:
                    ++fCount;
                    break;
            }
        }
        System.out.println("Grade report");
        if(gradeCounter != 0){
            double average = (double) total / gradeCounter;
            System.out.println("Total of the " + gradeCounter + " grades entered is " + total);
            System.out.println("Class average is " + average);
            System.out.println("Number of students who received each grade: \n" +
                     "A: " + aCount + "\n "+// display number of A grades
                     "B: " + bCount +"\n"+ // display number of B grades
                     "C: " + cCount + "\n"+// display number of C grades
                     "D: " + dCount + "\n"+// display number of D grades
                     "F: " + fCount); // display number of F grades
             }
         else // no g
          System.out.println("No grades were entered");

        }
    }
