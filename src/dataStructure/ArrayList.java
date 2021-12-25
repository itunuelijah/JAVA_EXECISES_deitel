package dataStructure;

public class ArrayList implements List {
    private int size;
    private int element;
    private int[] elements;

    public ArrayList(){
        elements = new int[6];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int element) {
        boolean isFull = getCapacity() == elements.length;
        int[] newArray = new int[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
        elements[size++] = element;
        //size++;
    }

    private int getCapacity() {
        return elements.length;
    }

    @Override
    public void remove(int element) {
        if(isEmpty()) throw new IllegalArgumentException("ArrayList is empty");
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int element, int position) {
        elements[position] = element;
    }

    @Override
    public int get(int index) {
        return elements[index];
    }

    @Override
    public int getIndexOf(int element) {
        for (int i = 0; i < elements.length; i++) {
            if(elements[i] == element)
                return i;
        }
        return 0;
    }

}

