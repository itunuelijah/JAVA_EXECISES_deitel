package chapter7;

public class SumArray {
    public static void main(String[] args) {

        int[] array = {87,56,56,78,98,665,43,22,34,7};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];
            System.out.printf("Total of array elements: %d%n", total);

    }
}
