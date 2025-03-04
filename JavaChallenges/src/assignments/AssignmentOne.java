package assignments;

import java.util.Arrays;

public class AssignmentOne {

    public static void main(String[] args) {

        int[] numbers = {75, 3, 4, 3, 6, 8, 15, 35, 4};

        System.out.println(sum(10));
        System.out.println(factorial(4));
        System.out.println(Arrays.toString(minAvgMax(numbers)));
    }

    //Write a function that takes a value n returns the sum of numbers 1 to n
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <=n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /*
        Write a function that computes the factorial value
        Definition: n! = n*(n-1)! , where 0! = 1
        1! = 1
        2! = 2 * 1! = 2 * 1
        3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
        4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
        Hint: use the recursive method that was used to calculate Fibonnaci number
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    /*
        Write 3 functions that take an array as a parameter and return the minimum, average, and
        maximum values of that array.
     */
    public static int[] minAvgMax(int[] values) {

        // find the minimum value
        int min = values[0];
        for (int value : values) {
            if (min > value)
            {
                min = value;
            }
        }

        //find the average value
        int avg;
        int sum = 0;
        for (int value : values) {
            sum = value + sum;
        }
        avg = (int) (sum / Arrays.stream(values).count());

        //find the maximum value
        int max = values[0];
        for (int value : values) {
            if (max < value)
            {
                max = value;
            }
        }

        int [] result = new int[3];
        result[0] = min;
        result[1] = avg;
        result[2] = max;

        return result;

    }
}
