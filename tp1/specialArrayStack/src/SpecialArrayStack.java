import java.sql.SQLOutput;
import java.util.EmptyStackException;

public class SpecialArrayStack<E> implements SpecialStack<E> {

    //insertion d'un tableau générique ayant comme nombre maximal d'élément 100
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
    //ajoute un élément sur la pile
    public void push(E e) {
        System.out.println(e);
        if (isFull()) {                 //cas où la pile est pleine
            throw new StackOverflowError("Stack is full");
        }
        array[++top1] = e;

        if (top2 == maxCapacity || updateMaxVal((Integer) array[top2], (Integer) e)) {
            array[--top2] = e;


        }
    }

    //permet d'insérer une nouvelle valeur maximale
    public boolean updateMaxVal(int maxVal, int e){
        return(e >= maxVal);
    }

    @Override
    //retire le dernier élément sur la pile et le renvoie 
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
    //renvoie le dernier élément sur la pile
    public E top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top1];
    }

    //vérifie si la pile double est pleine
    public boolean isFull() {
        return top1 + 1 == top2 || top2 - 1 == top1;
    }

    //vérifie si la pile est vide
    public boolean isEmpty() {
        return top1 == -1;
    }

    //renvoie la longueur de la pile
    public int size() {
        return top1;
    }

    //renvoie l'élément maximum stocké dans la pile spéciale
    public E getMax() {
        if (isEmpty()) {
            throw new IllegalStateException("La pile est vide");
        }
        return array[top2];
    }

    //produit une représentation en chaîne des éléments de la pile classés de haut en bas
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
