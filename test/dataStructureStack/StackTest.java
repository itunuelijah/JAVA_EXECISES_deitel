package dataStructureStack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack stack;
    @BeforeEach
    void startWithThis(){
        stack = new Stack(5);
    }

    @Test
    public void stackCanBeCreatedTest(){
        assertNotNull(stack);
    }

    @Test
    public void addXStackSizeIs1Test(){
        stack.push(3);
        assertEquals(1, stack.size());
    }

    @Test
    public void addXYStackSizeIs2Test(){
        stack.push(3);
        stack.push(4);
        assertEquals(2, stack.size());
    }

    @Test
    public void addXRemoveXStackShouldBeEmptyTest(){
        stack.push(3);
        stack.pop();
        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
    }
    @Test
    public void removeFromEmptyStack(){
        assertTrue(stack.isEmpty());
        assertThrows(Stack.UnderFlowException.class, ()-> stack.pop());
    }
    @Test
    public void addXPeekShowsXTest(){
        stack.push(4);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        assertEquals(9, stack.peek());
    }

    @Test
    public void addXYZPopZY_XShouldBeAtThePeekTest(){
        stack.push(4);
        stack.push(5);
        stack.push(7);
        stack.pop();
        stack.pop();
        assertEquals(1, stack.size());
        assertEquals(4, stack.peek());
    }

    @Test
    public void addXYZABC_StackOverflowTest(){
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        assertThrows(Stack.OverflowException.class, ()-> stack.push(9));

    }

    @Test
    public void underFlow_whenPeekIsCallOnEmptyStack(){
        stack.isEmpty();
        assertThrows(Stack.UnderFlowException.class, ()-> stack.peek());
    }
}