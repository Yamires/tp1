public class CityState {
    //montre l'état de chaque ville à la fin de chaque journée du déménagement
    public static void printCurrentState(int day, ArrayStack<CityLevel> nam, ArrayStack<CityLevel> pam, ArrayStack<CityLevel> sam){

       String namSections;
       String pamSections;
       String samSections;
        
        if (nam.isEmpty()){               //État de la ville de Nam qui est le point de départ 
            namSections = "empty";
        } else {
            namSections = nam.toString();
        }

        if (pam.isEmpty()){               //État de la ville temporelle de Pam
            pamSections = "empty";
        } else {
            pamSections = pam.toString();
        }
        if (sam.isEmpty()){               //État de la ville de Sam qui est le point final
            samSections = "empty";
        } else {
            samSections = sam.toString();
        }

        System.out.println("Jour " + day + ": Nam (" + namSections + "), Pam (" + pamSections + ") et Sam (" + samSections + ")");

    }
    
    // Fin de la simulation qui affirme la possibilité ou non de déplacer la ville
    public static void isMovePossible(boolean isMove, int day){
        if(isMove){
            System.out.println("Il est possible de déplacer la ville dans les 10 jours, car" + day + "jours sont nécessaires.");
        }
        else{
            System.out.println("Il est impossible de déplacer la ville dans les 10 jours, car" + day + "jours sont nécessaires.");
        }
    }
}


