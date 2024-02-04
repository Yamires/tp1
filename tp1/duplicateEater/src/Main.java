public class Main {
    public static void main(String[] args) {

        DuplicateEater duplicateEater = new DuplicateEater();

        String[] strings1 = {"pile", "liste", "liste", "file", "arbre"};

        String[] strings2 = {"arbre", "pile", "pile", "arbre"};

        duplicateEater.pairDestroyer(strings1);
        duplicateEater.pairDestroyer(strings2);
    }
}
