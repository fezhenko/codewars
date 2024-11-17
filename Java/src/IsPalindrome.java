import java.util.logging.Logger;

public class IsPalindrome {
    private static final Logger logger = Logger.getLogger(IsPalindrome.class.getSimpleName());

    public static void main(String[] args) {
        logger.info(String.valueOf(isPalindrome("qweiewq")));
    }

    private static boolean isPalindrome(String s) {
        // char[] q = {'a','b','c','d','c','b','a'};
        // 0=6
        // 1=5
        // 2=4

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;
        boolean isPalindrome = false;

        while (left < right) {
            if(chars[left] == chars[right]) {
                left++;
                right--;
                isPalindrome = true;
            }
        }

        return isPalindrome;
    }
}
