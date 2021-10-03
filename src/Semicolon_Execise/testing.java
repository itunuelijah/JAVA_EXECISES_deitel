package Semicolon_Execise;

import java.util.Scanner;
//
public class testing {
//
//    static final int CITIZENS = 3;
//    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        int total_yes, female_no, i;
//        String gender, answer;
//        total_yes = 0;
//        female_no = 0;
//        for (i = 1; i <= CITIZENS; i++) {
//            do {
//                System.out.print("Enter Gender: ");
//                gender = input.nextLine().toLowerCase();
//            } while (!gender.equals("m") && !gender.equals("f"));
//            do {
//                System.out.print("Do you eat breakfast in the morning? ");
//                answer = input.nextLine().toLowerCase();
//            } while (!answer.equals("y") && !answer.equals("n") && !answer.equals("s"));
//            if (answer.equals("y")) {
//                total_yes++;
//            }
//            if (gender.equals("f") && answer.equals("n")) {
//                female_no++;
//            }
//        }
//        System.out.println(total_yes + " " + female_no * 100 /(double)CITIZENS);
//    }
//
//}

    //----------------------------------------
    static final int ELEMENTS = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, pos_index, neg_index;
        String option1 = "A";
        String option2 = "B";

        String[] ar = new String[ELEMENTS];
        for (i = 0; i <= ELEMENTS - 1; i++) {
            System.out.print("Enter a string: ");
            ar[i] = input.nextLine();

        }
//Create arrays pos and neg
        String[] pos = new String[ELEMENTS];
        String[] neg = new String[ELEMENTS];
        pos_index = 0;
        neg_index = 0;
        for (i = 0; i <= ELEMENTS - 1; i++) {
            if (ar[i] == option1) {
                pos[pos_index] = ar[i];
                pos_index++;
            } else if (ar[i] == option2) {
                neg[neg_index] = ar[i];
                neg_index++;
            }
        }
        for (i = 0; i <= pos_index - 1; i++) {
            System.out.print(pos[i] + "\t");
        }
        System.out.println();
        for (i = 0; i <= neg_index - 1; i++) {
            System.out.print(neg[i] + "\t");
        }

    }
}