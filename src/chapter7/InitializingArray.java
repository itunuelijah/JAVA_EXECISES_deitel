package chapter7;

/**public class initializingArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
    }
*/

public class InitializingArray {
 public static void main(String[] args) {
 int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
 System.out.printf("%s%8s%n", "Index", "Value");
 for (int counter = 0; counter < array.length; counter++)
 System.out.printf("%5d%8d%n", counter, array[counter]);
 }
 }