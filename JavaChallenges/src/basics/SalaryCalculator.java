package basics;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Let's create a variable to define our career
        String career;
        System.out.println("Program is starting");
        career = "Software Developer";
        System.out.println("My career: " + career);

        // Declare and define variables
        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 40.00;

        // Compute annual salary
        double annualSalary = hoursPerWeek * weeksPerYear * rate;
        System.out.println(
                "My annual salary as a " + career +
                " at the rate of $" + rate +
                " per hour is $" + annualSalary);
    }
}
