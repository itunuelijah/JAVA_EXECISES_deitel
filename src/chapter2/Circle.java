package chapter2;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = scanner.nextInt();

        System.out.printf("Diameter = %f%n", radius*2 );
       System.out.printf("Circumference = %f%n", 2*Math.PI*radius);
       System.out.printf("Area = %f%n", Math.PI*Math.pow(radius,2));

    }
}



