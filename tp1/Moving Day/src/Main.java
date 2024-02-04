public class Main {
    public static void main(String[] args) {

        ArrayStack<CityLevel> Nam = new ArrayStack<>();
        ArrayStack<CityLevel> Pam = new ArrayStack<>();
        ArrayStack<CityLevel> Sam = new ArrayStack<>();

        String[] levelNames = {"N1: Agriculture", "N2: Manufacture", "N3: Académie", "N4: Gouvernement", "N5: Le Roi"};

        for (int i = levelNames.length - 1; i >= 0; i--) {
            Nam.push(new CityLevel(levelNames[i]));
        }

        MovingDay.moveLevels(Nam, Sam, Pam);
    }
}