public class DuplicateEater {

    public void pairDestroyer(String[] array) {  //méthode qui prend en entrée un tableau avec une séquence de mots

        ArrayStack<String> pairDestroyerStack = new ArrayStack<>(100);

        for (String item : array) {              //vérifie si deux mots similaires se suivent et les élimine 
            if (!pairDestroyerStack.isEmpty() && pairDestroyerStack.top().equals(item)) {
                pairDestroyerStack.pop();
            }
            else{
                pairDestroyerStack.push(item);
            }
        }
        // imprime le nombre de mots laissés dans la séquence
        // on peut l'enlever après test
        //System.out.println(pairDestroyerStack.toString());
        System.out.println(pairDestroyerStack.size());
    }
}


