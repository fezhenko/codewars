package get_the_middle;

// Kata.getMiddle("test") should return "es"
// Kata.getMiddle("testing") should return "t"
// Kata.getMiddle("middle") should return "dd"
// Kata.getMiddle("A") should return "A"

public class TheMiddleCharacter {
    public static String getMiddle(String word) {

        int middle = word.length() / 2;
        if (word.length() % 2 == 0) {
            return word.substring(middle - 1, middle + 1);
        } else {
            return String.valueOf(word.charAt(middle));
        }
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("middle"));
    }
}
