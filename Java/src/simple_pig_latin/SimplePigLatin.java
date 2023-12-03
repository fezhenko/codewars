package simple_pig_latin;


import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word.
 * Leave punctuation marks untouched.
 * <p>
 * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
 * pigIt('Hello world !');     // elloHay orldway !
 */

public class SimplePigLatin {
    public static String pigIt(String str) {

        String[] words = str.split("\\s+");
        char[] punctuations = new char[]{'!', '?', ':', '&', '.', ','};
        Arrays.sort(punctuations);

        return Arrays.stream(words)
                .map(word -> {

                    if (word.length() == 0) {
                        return word;
                    }

                    char lastChar = word.charAt(word.length() - 1);
                    if (Arrays.binarySearch(punctuations, lastChar) >= 0) {
                        return "%s".formatted(lastChar);
                    }

                    char firstChar = word.charAt(0);
                    return "%s%s%s".formatted(word.substring(1), firstChar, "ay");
                })
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        logger.warning(pigIt("Hello world ?"));
    }
}
