package SevenSegment;

import java.util.Scanner;

public class sevenSegmentScreen {
        public static void main(String [] args){

            Scanner input = new Scanner(System.in);

            SevenSegment segment = new SevenSegment();
            System.out.println("enter eight binary numbers");
            String UserInput = input.nextLine();
            segment.setSevenSegmentScreen(UserInput);
            segment.displayScreen();


        }
    }


