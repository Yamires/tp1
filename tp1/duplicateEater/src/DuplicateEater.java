public class DuplicateEater {

    public void pairDestroyer(String[] array) {

        ArrayStack<String> pairDestroyerStack = new ArrayStack<>(100);

        for (String item : array) {
            if (!pairDestroyerStack.isEmpty() && pairDestroyerStack.top().equals(item)) {
                pairDestroyerStack.pop();
            }
            else{
                pairDestroyerStack.push(item);
            }
        }

        // on peut l'enlever après test
        //System.out.println(pairDestroyerStack.toString());
        System.out.println(pairDestroyerStack.size());
    }
}


