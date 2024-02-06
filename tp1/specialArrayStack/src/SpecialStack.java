public interface SpecialStack<E> {
    public void push(E e);      //ajoute un élément sur la pile
    public E pop();             //retire le dernier élément sur la pile et le renvoie
    public E top();             //renvoie le dernier élément sur la pile
    public boolean isEmpty();   //vérifie si la pile est vide
    public String toString();   //produit une représentation en chaîne des éléments de la pile classés de haut en bas
}

