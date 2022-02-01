package chapter18;

public class RecursionFactorials {
    public static void main(String[] args) {


        int factorial = 1;
       int  number = 5;
        for (int counter = number; counter >= 1; counter--)
            factorial *= counter;

        System.out.println(factorial) ;
    }
}