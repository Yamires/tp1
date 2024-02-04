public class CityState {
    public static void printCurrentState(int day, ArrayStack<CityLevel> nam, ArrayStack<CityLevel> pam, ArrayStack<CityLevel> sam){

       String namSections;
       String pamSections;
       String samSections;

        if (nam.isEmpty()){
            namSections = "empty";
        } else {
            namSections = nam.toString();
        }

        if (pam.isEmpty()){
            pamSections = "empty";
        } else {
            pamSections = pam.toString();
        }
        if (sam.isEmpty()){
            samSections = "empty";
        } else {
            samSections = sam.toString();
        }

        System.out.println("Jour " + day + ": Nam (" + namSections + "), Pam (" + pamSections + ") et Sam (" + samSections + ")");

    }

    public static void isMovePossible(boolean isMove, int day){
        if(isMove){
            System.out.println("Il est possible de déplacer la ville dans les 10 jours, car" + day + "jours sont nécessaires.");
        }
        else{
            System.out.println("Il est impossible de déplacer la ville dans les 10 jours, car" + day + "jours sont nécessaires.");
        }
    }
}


