package Semicolon_Exercise;
import java.util.Scanner;

public class ResultGrades {
        public static void main(String[] args) {
            int total = 0;
            int gradeCounter = 0;
            int countOfAGrades = 0;
            int countOfBGrades = 0;
            int countOfCGrades = 0;
            int countOfDGrades = 0;
            int countOfFGrades = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the integer grades in the range 0-100.");
            while (input.hasNext()) {
                int grade = input.nextInt();
                total += grade;
                ++gradeCounter;
                switch (grade / 10) {
                    case 9:
                    case 10:
                        ++countOfAGrades;
                        break;

                    case 8:
                        ++countOfBGrades;
                        break;

                    case 7:
                        ++countOfCGrades;
                        break;

                    case 6:
                        ++countOfDGrades;
                        break;

                    default:
                        ++countOfFGrades;
                        break;
                }
            }
            System.out.printf("%nGrade Report:%n");
            if (gradeCounter != 0) {
                double average = (double) total / gradeCounter;

                System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
                System.out.printf("Class average is %.2f%n", average);
                System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade:",
                        "A: ", countOfAGrades,
                        "B: ", countOfBGrades,
                        "C: ", countOfCGrades,
                        "D: ", countOfDGrades,
                        "F: ", countOfFGrades);
             } else
                System.out.println("No grades were entered");
          }
       }
