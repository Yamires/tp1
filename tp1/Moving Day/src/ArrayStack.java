public class ArrayStack<E> implements Stack<E> {

    public static int maxCapacity = 100;
    private E[] array;
    private int size;

// constructeur
    // mettre max cap instead of capacity??
    public ArrayStack() {
        array = (E[]) new Object[maxCapacity];
        size = 0;
    }

    @Override
    public void push(E e){
        if (size == maxCapacity) {
            throw new IllegalStateException("Capacitée maximale de la pile atteinte");
        }
        // ajoute e à la position
        array[size] = e;
        // augmente la taille de array
        size++;
    }

    @Override
    public E pop() {
        if (isEmpty()){
            throw new IllegalStateException("La pile est vide");
        }
        return array[--size];
    }

    @Override
    public E top() {
        if (isEmpty()){
            throw new IllegalStateException("La pile est vide");
        }
        return array[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public String toString() {
        StringBuilder stringE = new StringBuilder();
        stringE.append("[");
        for (int i = 0; i < size; i++){
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
