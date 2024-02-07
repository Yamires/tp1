public class ArrayStack<E> implements Stack<E> {

    public static int maxCapacity = 100;  //limite le nombre d'élément à 100
    private E[] array;
    private int size;


// constructeur
    // mettre max cap instead of capacity??
    // rejette si la capacité disponible pour les éléments est inférieur à 0 ou supérieur à 100
    public ArrayStack(int capacity) {         
        if (capacity < 0 || capacity > maxCapacity) {
            throw new IllegalArgumentException("Capacitée invalide" + capacity);
        }
        array = (E[]) new Object[capacity];
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
        if (isEmpty()){       //cas où la pile contient aucun dernier élément
            throw new IllegalStateException("La pile est vide");
        }
        return array[--size]; //retire et renvoie le dernier élément sur la pile
    }

    @Override
    public E top() {
        if (isEmpty()){          //cas où la pile contient aucun dernier élément
            throw new IllegalStateException("La pile est vide");
        }
        return array[size - 1];  //renvoie le dernier élément sur la pile

    }

    @Override
    public boolean isEmpty() {   //vérification d'une pile qui est vide ou pas
        return size == 0;
    }
    @Override
    public String toString() {   //produit une représentation en chaîne des éléments de la pile classée de haut en bas
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
    public int size() {      //renvoie la longueur de la pile
        return size;
    }

}
