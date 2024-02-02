import java.sql.SQLOutput;
import java.util.EmptyStackException;

public class SpecialArrayStack<E> implements SpecialStack<E> {

    private E[] array;
    private int top1;
    private int top2;
    private int maxCapacity = 100;

    public SpecialArrayStack() {
        array = (E[]) new Object[maxCapacity];
        top1 = -1;
        top2 = maxCapacity ;
    }

    @Override
    public void push(E e) {
        System.out.println(e);
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        array[++top1] = e;

        if (top2 == maxCapacity || updateMaxVal((Integer) array[top2], (Integer) e)) {
            array[--top2] = e;


        }
    }

    public boolean updateMaxVal(int maxVal, int e){
        return(e >= maxVal);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        E e = array[--top1];

        //array[top1] = null;

        if (top2 < maxCapacity && e.equals(array[top2])) {
            top2++;
        }
        return e;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top1];
    }

    public boolean isFull() {
        return top1 + 1 == top2 || top2 - 1 == top1;
    }

    public boolean isEmpty() {
        return top1 == -1;
    }

    public int size() {
        return top1;
    }

    public E getMax() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide");
        }
        return array[top2];
    }

    public String toString() {
        StringBuilder stringE = new StringBuilder();
        stringE.append("[");

        for (int i = 0; i <= (top1); i++) {
            stringE.append(array[i]);
            if (i < (top1 )) {
                stringE.append(", ");
            }
        }

        stringE.append("]");
        return stringE.toString();
    }

}
