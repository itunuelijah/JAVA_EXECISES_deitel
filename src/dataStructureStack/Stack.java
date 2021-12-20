package dataStructureStack;

public class Stack {
    private int numberOfElements;
    private int element;
    private int[] elements;

    public Stack(int capacity) {
        elements = new int[capacity];
    }

    public void push(int element) {
        if(numberOfElements == elements.length) throw new OverflowException("Stack overflow");
        try {
            elements[numberOfElements++] = element;
            this.element = element;
        }
        catch (OverflowException e){
            System.out.println(e.getMessage());
        }

    }

    public int size() {
        return numberOfElements;
    }

    public int pop() {
        if(isEmpty()) throw new UnderFlowException("Stack is empty");
        return numberOfElements--;
    }

    public boolean isEmpty() {
        if (size() == 0)
        return true;
        else
            return false;
    }

    public int peek() {
        if(isEmpty()) throw new UnderFlowException("Stack is empty");
        return elements[numberOfElements-1];
    }

    public static class UnderFlowException extends RuntimeException{

        public UnderFlowException(String message) {
            super(message);
        }
    }

    public static class OverflowException extends StackOverflowError {

        public OverflowException(String message) {
            super(message);
        }
    }
}
