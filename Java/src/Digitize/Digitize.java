package Digitize;

import java.util.Arrays;



public class Digitize
{
    public static String digitize(long n)
    {
        String number = Long.toString(n);
        int[] numberArray = new int[number.length()];
        int[] reversedArray = new int[number.length()];
        int j = number.length();

        for (int i = 0; i < numberArray.length; ++i) {
            reversedArray[j - 1] = number.charAt(i) - 48;
            --j;
        }
        return Arrays.toString(reversedArray);
    }

    public static void main (String[]args)
    {
        System.out.println(digitize(12345L));
    }
}
