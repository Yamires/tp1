public class MovingDay {

    private static int dayCounter = 0;   //initialisation du compteur de jours à 0 afin d'augmenter journée par journée
    private static String moveIs;

    // Éxécute ou non les déplacement des niveaux entre la ville source, Nam,
    // la ville destination, Sam, et la ville temporelle middle, Pam
    public static void moveLevels(ArrayStack<CityLevel> source, ArrayStack<CityLevel> destination, ArrayStack<CityLevel> middleCity) {
        if (source.isEmpty()) {        // cas où il ne reste plus rien à déplacer à Nam
            throw new IllegalStateException("Source city is empty, no levels to move.");
        }


        while (!source.isEmpty()) {    // déplacement entre la ville source, Nam, et la ville temporelle Pam
            CityLevel levelToMove = source.pop();
            middleCity.push(levelToMove);
            CityState.printCurrentState(dayCounter++, source, destination, middleCity);
        }

        while (!middleCity.isEmpty()) { // déplacement entre la ville temporelle Pam et la ville destination Sam

            CityLevel levelInMiddle = middleCity.pop();
            destination.push(levelInMiddle);
            // change to moveState
            CityState.printCurrentState(dayCounter++, source, destination, middleCity);

        }
        
        // Vérifie si en mesure de faire le mouvement dans un délai de 10 jours
        CityState.isMovePossible(dayCounter <= 10, dayCounter); 


    }
}




