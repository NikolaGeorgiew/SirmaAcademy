import java.util.ArrayDeque;
import java.util.Stack;

public class Jar<T> {
    private ArrayDeque<T> stack;

    public Jar() {
        this.stack = new ArrayDeque<>();
    }

    public void add(T element) {
        stack.push(element);
    }
    public T remove() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            throw new IllegalStateException("Jar is empty");
        }
    }
}
