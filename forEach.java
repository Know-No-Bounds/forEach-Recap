// For loops in a defined range

public class forEach {

    public static void main(String[] args) throws InterruptedException {

        // iterative for loops
        // Countdown program


        /*
         for (iterator; condition; increment) {
            // Block of code
         }
         */

        // for (int j = 10; j > 0; --j) {

        //     System.out.println(j);
        //     Thread.sleep(1000);
        // }

        // System.out.println("Happy New Month");

        // Array -> each of the items in the array

        // Syntax -> String[] name = {"item1", "item2", "item3", "item4"};

        String[] cars = {"volvo", "bmw", "mercedes", "ford"};

        // for each
        // for (String each: array) {
        // pile of code
        //}

        System.out.println("List of cars");
        int enumerate = 1;

        for (String car: cars) {
            System.out.printf("%d. %s\n", enumerate, car);
            enumerate++;
        }
    }
}