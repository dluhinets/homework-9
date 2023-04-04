package generic;

import java.util.Arrays;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 10;
    private Object[] array = new Object[INIT_SIZE];
    private int pos = 0;

    public void add(Object item) {
        if (pos == array.length - 1) {
            int newLength = array.length + array.length / 2;
            arrayResizing(newLength);
        }
        array[pos] = item;
        pos++;
    }

    public void remove(int index) {
        for (int i = index; i < pos; i++) {
            array[i] = array[i + 1];
        }
        pos--;
        if (array.length > INIT_SIZE && pos < array.length / 2) {
            int newLength = array.length - array.length / 2;
            arrayResizing(newLength > INIT_SIZE ? newLength : INIT_SIZE);
        }
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void clear() {
        array = new Object[INIT_SIZE];
        pos = 0;
    }

    public int size() {
        return pos;
    }

    private void arrayResizing(int newLength) {
        Object[] newArray = Arrays.copyOf(array, newLength);
        array = newArray;
    }
}
