package count_characters_in_your_string;

import java.util.HashMap;
import java.util.Map;


/**
 * The main idea is to count all the occurring characters in a string.
 * If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
 * What if the string is empty? Then the result should be empty object literal, {}.
 */

public class Kata {

    public static final int INIT_COUNT = 1;

    public static Map<Character, Integer> count(String str) {

        char[] chars = str.toCharArray();
        Map<Character, Integer> charactersMap = new HashMap<>();

        for (char character : chars) {
            if (charactersMap.containsKey(character)) {
                int currentCount = charactersMap.get(character);
                charactersMap.put(character, currentCount + 1);
                continue;
            }
            charactersMap.put(character, INIT_COUNT);
        }

        return charactersMap;
    }

    public static void main(String[] args) {

        System.out.println(Kata.count("abc"));
    }
}
