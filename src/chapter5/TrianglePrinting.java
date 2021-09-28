package chapter5;

public class TrianglePrinting {
    public static void main(String[] args) {

        for (int roll = 1; roll <= 10; roll++) {

            for (int column = 1; column <= roll; column += 1) {
                System.out.print("*");
            }
            for (int column = 1; column <= 5; column += 1) {
                System.out.print(" ");
            }
            for (int column = 10; column >= roll; column -= 1) {
                System.out.print(" ");
            }
            for (int column = 10; column >= roll; column -= 1) {
                System.out.print("*");
            }
            for (int column = 1; column <= roll; column += 1) {
                System.out.print(" ");

            }
            for (int column = 1; column <= 5; column += 1) {
                System.out.print(" ");
            }

            for (int column = 1; column <= roll; column += 1) {
                System.out.print(" ");
            }
            for (int column = 10; column >= roll; column -= 1) {
                System.out.print("*");
            }
            for (int column = 1; column <= 5; column += 1) {
                System.out.print(" ");
            }
            for (int column = 10; column >= roll; column -= 1) {
                    System.out.print(" ");
            }
            for (int column = 1; column <= roll; column += 1) {
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}








