package chapter5;

public class DiamondPrinting {
    public static void main(String[] args) {

        for (int roll = 1; roll <= 5; roll++) {
            for (int column = 5; column >= roll; column -= 1) {
                System.out.print(" ");
            }
            for (int column = 1; column <= roll; column += 1) {
                System.out.print("*");
            }
            for (int column = 1; column < roll; column += 1) {
                System.out.print("*");
            }
            for (int column = 5; column >= roll; column -= 1) {
                System.out.print(" ");
            }
        System.out.println("");
        }

        for (int rolls = 1; rolls <= 4; rolls++) {
            for (int column = 4; column >= 4; column -= 1) {
                System.out.print(" ");
            }
            for (int column = 1 ; column <= rolls; column += 1) {
                System.out.print(" ");
            }
            for (int column =4; column >rolls; column -= 1) {
                System.out.print("*");
            }
            for (int column = 4; column >= rolls; column -= 1) {
                System.out.print("*");
            }
            for (int column = 1; column <= rolls; column += 1) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}