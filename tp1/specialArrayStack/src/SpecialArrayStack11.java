public class SpecialArrayStack11<E extends Comparable<E>> implements SpecialStack<E> {
    public static int maxCapacity = 100;
    private E[] array;
    private int size;
    private E[] maxArray;
    private int maxSize;
    private int topStack;
    private int topMaxStack;


    public SpecialArrayStack11() {
        array = (E[]) new Object[maxCapacity];
        topStack = -1;
        topMaxStack = maxCapacity;
    }
    @Override
    public void push(E e) {
        if (size == maxCapacity) {
            throw new IllegalStateException("Capacitée maximale de la pile atteinte");
        }
        // ajoute e à la position
        array[size] = e;
        // augmente la taille de array
        size++;

        if (maxSize == 0 || e.compareTo(maxArray[maxSize - 1]) >= 0) {
            maxArray[maxSize] = e;
            maxSize++;
        }

    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide");
        }
        E e = array[size - 1];
        size--;
        if (e.equals(maxArray[maxSize - 1])) {
            maxSize--;
        }
        return e;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide");
        }
        return array[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

  public E getMax(){
        if (isEmpty()){
            throw new IllegalStateException("La pile est vide");
        }
        return(maxArray[maxSize - 1]);
    }

    @Override
    public String toString() {
        StringBuilder stringE = new StringBuilder();
        stringE.append("[");
        for (int i = 0; i < size; i++) {
            stringE.append(array[i]);
            if (i < size - 1) {
                stringE.append(", ");
            }
        }
        stringE.append("]");
        return stringE.toString();
    }

    public int size() {
        return size;
    }

}
