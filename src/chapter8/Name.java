package chapter8;

import java.util.Scanner;

public class Name{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = input.next();
        String[] reverse = new String[name.length()];

        System.out.println("Reversed name: ");


        for(int i = name.length() - 1; i >= 0; i--) {
        System.out.print(name.charAt(i) + " ");
        }
    }


}
