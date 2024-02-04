public class MovingDay {

    private static int dayCounter = 0;
    private static String moveIs;

    public static void moveLevels(ArrayStack<CityLevel> source, ArrayStack<CityLevel> destination, ArrayStack<CityLevel> middleCity) {
        if (source.isEmpty()) {
            throw new IllegalStateException("Source city is empty, no levels to move.");
        }


        while (!source.isEmpty()) {
            CityLevel levelToMove = source.pop();
            middleCity.push(levelToMove);
            CityState.printCurrentState(dayCounter++, source, destination, middleCity);
        }

        while (!middleCity.isEmpty()) {

            CityLevel levelInMiddle = middleCity.pop();
            destination.push(levelInMiddle);
            // change to moveState
            CityState.printCurrentState(dayCounter++, source, destination, middleCity);

        }
        CityState.isMovePossible(dayCounter <= 10, dayCounter);


    }
}




