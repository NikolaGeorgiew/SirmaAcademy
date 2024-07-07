import java.util.List;

public class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static <T extends Comparable<T>> void swapElements(List<Box<T>> list, int index1, int index2) {
        Box<T> temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    @Override
    public String toString() {
        return value.getClass().getName() + ": " + value;
    }

    @Override
    public int compareTo(Box<T> other) {
        return this.value.compareTo(other.getValue());
    }
}
