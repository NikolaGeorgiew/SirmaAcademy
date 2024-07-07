import java.util.ArrayList;
import java.util.List;

public class CustomList <T extends Comparable<T>>{
    private T[] elements;
    private int size;

    @SuppressWarnings("unchecked")
    public CustomList() {
        this.elements = (T[])new Comparable[10];
        this.size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw  new IndexOutOfBoundsException("Index out of bound");
        }
        T removedElement = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
        return  removedElement;
    }
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
    public void swap(int index1, int index2) {
        if (index1 >= size || index1 < 0 ||index2 >= size || index2 < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }
    public int countGreaterThan(T element) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (elements[i].compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
    public T getMax() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        T max = elements[0];
        for (int i = 1; i < size; i++) {
            if (elements[i].compareTo(max) > 0) {
                max = elements[i];
            }
        }
        return max;
    }
    public T getMin() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        T min = elements[0];
        for (int i = 1; i < size; i++) {
            if (elements[i].compareTo(min) < 0) {
                min = elements[i];
            }
        }
        return min;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newElements = (T[])new Comparable[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

}
