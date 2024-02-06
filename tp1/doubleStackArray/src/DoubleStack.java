public interface DoubleStack<E> {
    public void push(boolean one, E e);   //ajoute un élément sur la pile et renvoie vrai si possible
    public E pop(boolean one);            //retire le dernier élément sur la pile et le renvoie
    public E top(boolean one);            //renvoie la longueur de la pile
    public  boolean isFull();             //vérifie si la pile double est pleine

}
