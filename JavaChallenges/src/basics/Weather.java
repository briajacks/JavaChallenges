package basics;

import java.util.Objects;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        // This program will give suggestions of what to wear based on the temperature and sun condition.
        int temperature = getTemperature();
        String sunCondition = getSunCondition();

        if (temperature > 80) {
            System.out.println("It's pleasant. Wear shorts and t-shirt.");
        } else if ((temperature > 60) && (Objects.equals(sunCondition, "Sunny"))) {
            System.out.println("It's a little cooler. Wear long-sleeve shirt and jeans.");
            System.out.println("Wear a hat to keep the sun out of your eyes.");
        } else if ((temperature > 50) || (Objects.equals(sunCondition, "Overcast"))) {
            System.out.println("This is a cool day. Make su50re to wear a sweater.");
        } else {
            System.out.println("Looks like a cold day. Wear a coat.");
        }
        System.out.println("The program is ending.");
    }

    private static int getTemperature() {
        System.out.println("Enter the temperature: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String getSunCondition() {
        System.out.println("Enter the sun condition: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
