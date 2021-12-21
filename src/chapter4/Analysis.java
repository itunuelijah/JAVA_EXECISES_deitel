package chapter4;
import java.util.Scanner;
    
    
public class Analysis {
    public static void main (String[]args) {
         // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        // process 10 students using counter-controlled loop
        int studentCounter = 1;
        while ( studentCounter <= 10)
             {
             // prompt user for input and obtain value from user
             System.out.print("Enter result (1 = pass, 2 = fail): ");
             int result = input.nextInt();
// initializing variables in declarations
            int passes = 0;
            int failures = 0;
//            int studentCounter = 1;
// if...else is nested in the while statement
            if (result == 1)
                passes = passes + 1;
            else
                failures = failures + 1;
            
            studentCounter = studentCounter + 1;
        }
    }
}
