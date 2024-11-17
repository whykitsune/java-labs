public class Stack<T> {
    private final T[] data;
    private int size;
    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }
    public void push(T element) {
        data[size] = element;
        size++;
    }
    public T pop() {
        if (size > 0) {
            T elem = data[size - 1];
            data[size - 1] = null;
            size--;
            return elem;
        } else {
            return null;
        }
    }
    public T peek() {
        if (size > 0) {
            return data[size - 1];
        } else {
            return null;
        }
    }
}