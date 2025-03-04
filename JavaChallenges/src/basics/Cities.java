package basics;

import java.util.Objects;

public class Cities {
    public static void main(String[] args) {
        // Declare and define an array
        String[] cities = {"New York", "Atlanta", "Miami", "Denver"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);

        // Declare the array
        String[] countries;
        // Define the array
        countries = new String[3];
        countries[0] = "USA";
        countries[1] = "Canada";
        countries[2] = "UK";
        System.out.println(countries[0]);
        System.out.println(countries[1]);
        System.out.println(countries[2]);

        System.out.println("*******************");

        //Declare and define the array (only size)
        String[] states = new String[5];
        states[0] = "California";
        states[1] = "Ohio";
        states[2] = "New Jersey";
        states[3] = "Texas";
        states[4] = "Utah";


        int i = 0;
        // Do loop: enters the loop THEN tests condition
        do {
            System.out.println("STATE: " + states[i]);
            i = i + 1;
        } while (i < 5);

        // While loop: tests condition first then enters loop
        int count = 0;
        boolean stateFound = false;
        while (!stateFound) {
            String state = states[count];
            System.out.println(state);
            if (Objects.equals(state, "Texas")) {
                System.out.println("STATE FOUND!");
               stateFound = true;
            }
            count++;
        }

        // For loop: best structure for iterating through an array
        for (int x = 0; x < 5; x++) {
            System.out.println(states[x]);
        }
    }
}
