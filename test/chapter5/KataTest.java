package chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

class KataTest {

    private Assertions Assertion;
    private int copiesOfPastQuestions;

    @Test
    public void testPriceForLessThan5(){
        Kata kata = new Kata();
int totalPrice = kata.getPrice(1);
        Assertions.assertEquals(1500, totalPrice);
    }

    @Test
    public void testPriceForLessThan10(){
        Kata kata = new Kata();
        int totalPrice = kata.getPrice(6);
        Assertions.assertEquals(1400, totalPrice);
    }
    @Test
    public void testPriceForLessThan30(){
        Kata kata = new Kata();
        int totalPrice = kata.getPrice(12);
        Assertions.assertEquals(1200, totalPrice);
    }
    @Test
    public void testPriceForLessThan50(){
        Kata kata = new Kata();
        int totalPrice = kata.getPrice(34);
        Assertions.assertEquals(1100, totalPrice);
    }
    @Test
    public void testPriceForLessThan100(){
        Kata kata = new Kata();
        int totalPrice = kata.getPrice(57);
        Assertions.assertEquals(1000, totalPrice);
    }
    @Test
    public void testPriceForLessThan200(){
        Kata kata = new Kata();
        int totalPrice = kata.getPrice(148);
        Assertions.assertEquals(900, totalPrice);
    }
    @Test
    public void testPriceForGreaterThan100(){
        Kata kata = new Kata();
        int totalPrice = kata.getPrice(257);
        Assertions.assertEquals(800, totalPrice);
    }
}

