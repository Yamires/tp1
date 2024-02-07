public interface Stack<E> {
    public void push(E e);         //Ajoute un élément sur la pile
    public E pop();                //Retire le dernier élément sur la pile et le renvoie
    public E top();                //Renvoie le dernier élément sur la pile
    public boolean isEmpty();      //Vérifie si la pile est vide
    public String toString();      //Produit une représentation en chaîne des éléments de la pile classés de haut en bas
}

