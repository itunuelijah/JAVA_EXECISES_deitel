package Semicolon_Execise;

import java.util.Scanner;

public class Result_analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        while(studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail):");
            int result = input.nextInt();
            if (result == 1)
                passes = passes + 1;
            else
                failures = failures + 1;
            studentCounter++;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        if (passes > 8)
            System.out.println("Bonus to instructor!");
        }
    }









/***
    Scanner in = new Scanner(System.in);

// Loop until they enter either yes or no.
while(true){
        String line = in.nextLine();
        // Use this to check if it is yes or no
        if(line.equalsIgnoreCase("yes")){
            // Process yes
            break;
        }else if(line.equalsIgnoreCase("no")){
            // Process no
            break;
        }else{
            // Tell them to enter yes or no since they entered something else.
        }
    }**/

