import java.util.EmptyStackException;

public class DoubleStackArray<E> implements DoubleStack<E> {

    private E[] array;
    private int top1;
    private int top2;
    private int maxCapacity = 100;

    //implémente deux piles dans un même tableau générique
    public DoubleStackArray() {
        array = (E[]) new Object[maxCapacity];
        top1 = -1;
        top2 = maxCapacity;
    }

    // insertion d'un booléen one afin d'indiquer quel pile on traite dans chaque fonction
    @Override
    //ajoute un élément sur la pile et renvoie si c'est possible ou non
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
    //retire le dernier élément sur la pile et le renvoie
    public E pop(boolean one) {
        if (one) {
            if (isEmpty()) {                      //cas où la pile est vide
                throw new EmptyStackException();
            }
            E e = array[top1];
            array[top1--] = null;                 //indique que le dernier élément devient null
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
    //renvoie le dernier élément sur la pile
    public E top(boolean one) {       
        if (one) {
            return array[top1];
        } else {
            return array[top2];
        }
    }

    @Override
    //vérifie si la pile double est pleine
    public boolean isFull() {
        return (top1 + 1 == top2) || (top2 - 1 == top1);
    }

    // vérifie si la pile est vide
    public boolean isEmpty() {
        return (top1 == -1) || (top2 == maxCapacity);
    }

    //renvoie la longueur de la pile 
    public int size(boolean one) {
        if (one) {
            return (top1 + 1);
        } else {
            return (maxCapacity - top2);
        }
    }

    //produit une représentation en chaîne des éléments de la pile classés de haut en bas
    public String toString() {
        StringBuilder stringE = new StringBuilder();
        stringE.append("[");

        //pour la pile 1
        for (int i = 0; i <= top1; i++) {   
            stringE.append(array[i]);
            if (i < top1) {
                stringE.append(", ");
            }
        }

        //pour la pile 2
        for (int i = maxCapacity - 1; i >= top2; i--) {
            stringE.append(", ");
            stringE.append(array[i]);
        }

        stringE.append("]");
        return stringE.toString();
    }
}
