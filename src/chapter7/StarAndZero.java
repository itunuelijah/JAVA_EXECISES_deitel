package chapter7;

import java.util.Arrays;

public class StarAndZero {
    public static void main(String[] args) {
        String [][]  array = {{"X", "O", "X",}, {"X", "O", "X",}, {"O", "X", "O"}};
   for (char row = 0; row < array.length; row++) {
            for (int column = 0; column < row; column++) {
                System.out.println(array[row]);
            }
            System.out.println();
        }
    }
}

