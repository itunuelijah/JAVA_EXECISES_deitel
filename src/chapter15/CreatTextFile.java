package chapter15;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

public class CreatTextFile {
    public static void main(String[] args) {

    while (input.hasNext()){
        try{
            output.format("%d %s %s %.2f%n", input.nextInt(),
                    input.nextLine());
        }
        catch (NoSuchElementException elementException){
            System.err.println("Invalid input. Please try again. ");
            input.nextLine();
        }
        System.out.println("?");
      }
    }
    catch (SecurityException | FileNotFoundException |
    FormatterClosedException e){
        e.printStackTrace();
    }
}
}
