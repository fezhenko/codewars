package calculate_average;

import java.util.Arrays;

public class CalculateAverage {

    public static double find_average(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 99};
        System.out.println(find_average(numbers));
    }
}
