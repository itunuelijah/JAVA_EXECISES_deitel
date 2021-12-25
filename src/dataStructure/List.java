package dataStructure;

public interface List {

    boolean isEmpty();

    void add(int value);

    void remove(int i);

    int size();

    void add(int element, int position);

    int get(int index);

    int getIndexOf(int element);
}