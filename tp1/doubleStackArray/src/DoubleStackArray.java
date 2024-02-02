import java.util.EmptyStackException;

public class DoubleStackArray<E> implements DoubleStack<E> {

    private E[] array;
    private int top1;
    private int top2;
    private int maxCapacity = 100;

    public DoubleStackArray() {
        array = (E[]) new Object[maxCapacity];
        top1 = -1;
        top2 = maxCapacity;
    }


    @Override
    public void push(boolean one, Object e) {
        if (one) {
            if (isFull()) {
                throw new IllegalStateException("la pile est plein");
            }
            array[++top1] = (E) e;
        } else {
            if (isFull()) {
                throw new IllegalStateException("la pile est plein");
            }
            array[--top2] = (E) e;
        }
    }

    @Override
    public E pop(boolean one) {
        if (one) {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            E e = array[top1];
            array[top1--] = null;
            return e;
        } else {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            E e = array[top2];
            array[top2++] = null;
            return e;
        }
    }

    @Override
    public E top(boolean one) {
        if (one) {
            return array[top1];
        } else {
            return array[top2];
        }
    }

    @Override
    public boolean isFull() {
        return (top1 + 1 == top2) || (top2 - 1 == top1);
    }

    public boolean isEmpty() {
        return (top1 == -1) || (top2 == maxCapacity);
    }

    public int size(boolean one) {
        if (one) {
            return (top1 + 1);
        } else {
            return (maxCapacity - top2);
        }
    }

    public String toString() {
        StringBuilder stringE = new StringBuilder();
        stringE.append("[");

        for (int i = 0; i <= top1; i++) {
            stringE.append(array[i]);
            if (i < top1) {
                stringE.append(", ");
            }
        }

        for (int i = maxCapacity - 1; i >= top2; i--) {
            stringE.append(", ");
            stringE.append(array[i]);
        }

        stringE.append("]");
        return stringE.toString();
    }
}
