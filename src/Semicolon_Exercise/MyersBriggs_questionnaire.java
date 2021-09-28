package Semicolon_Exercise;


import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer

public class MyersBriggs_questionnaire {
    public static void main(String[] args) {

        String[] questions = {
                "1.   (A) expend energy, enjoy groups                                     (B) conserve energy, enjoy one-on-one",
                "2.   (A) interpret literally                                             (B) look for meaning and possibilities", "3.   (A) logical, thinking, questioning                                  (B) empathetic, feeling, accommodating",
                "4.   (A) organized, orderly                                              (B) flexible, adaptable",
                "5.   (A) more outgoing, think out loud                                   (B) more reserved, think to yourself",
                "6.   (A) practical, realistic, experiential                              (B) imaginative, innovative, theoretical",
                "7.   (A) candid, straight forward, frank                                 (B) tactful, kind, encouraging",
                "8.   (A) plan, schedule                                                  (B) unplanned, spontaneous",
                "9.   (A) seek many tasks, public activities, interaction with others     (B) seek private, solitary activities with quiet to concentrate",
                "10.  (A) standard, usual, conventional                                   (B) different, novel, unique",
                "11.  (A) firm, tend to criticize, hold the line                          (B) gentle, tend to appreciate, conciliate",
                "12.  (A) regulated, structured                                           (B) easygoing, \"live\" and \"let live\"",
                "13.  (A) external, communicative, express yourself                       (B) internal, reticent, keep to yourself",
                "14.  (A) focus on here-and-now                                           (B) look to the future, global perspective, \"big picture\"",
                "15.  (A) tough-minded, just                                              (B) tender hearted, merciful",
                "16.  (A) preparation, plan ahead                                         (B) go with the flow, adapt as you go",
                "17.  (A) active, initiate                                                (B) reflective, deliberate",
                "18.  (A) fact, things, \"what is\"                                       (B) ideas, dreams, \"what would be\", philosophical",
                "19.  (A) matter of fact, issue oriented                                  (B) sensitive, people oriented, compassionate",
                "20.  (A) Control, govern                                                 (B) latitude, freedom"
        };


        Scanner input = new Scanner(System.in);
        String char1 = "A";
        String char2 = "B";

        String[] response = new String[questions.length - 1];
        [] a = new String[questions.length];
        String[] b = new String[questions.length];

        System.out.println("Select option 'A' or 'B' from the following questions: ");
        for (int row = 0; row <= questions.length - 1; row++) {
            System.out.println(questions[row] + ":");
            System.out.print("Enter choice: ");
            String choice = input.nextLine().trim();
            Arrays.fill(a, choice);
            Arrays.fill(b, choice);
        }


        System.out.println("your output is:");

        for (int row = 0; row <= questions.length - 1; row += 5) {
            for (int column = 0; column <= questions.length - 17; column++) {
                if (response[row] == char1) {
                    a[row] = response[row];
                } else if (response[row] == char2) {
                    b[row] = response[row];
                }

                System.out.print(a[row]);
                System.out.print(b[row] + " ");

            }
            System.out.println();
        }
    }
}






*/








//    public class AccountTest {
//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            Account myAccount = new Account("Jane green");
//            System.out.printf("Initial name is: %s%n%n", myAccount.getName());
//
//            System.out.println("Please enter the name:");
//            String theName = input.nextLine(); // read a line of text
//            myAccount.setName(theName);
//            System.out.println(); // outputs a blank line
//             // display the name stored in object myAccount
//            System.out.printf("Name in object myAccount is:%n%s%n",myAccount.getName());
//
//
//        }
//    }
//}
//
//private String a;
//    public void input(String  input1){
//    if (input1 == "A") // if the depositAmount is valid
//            a = a + input1;
//    }
//    public double getA()
//    {
//        return a;
//    }