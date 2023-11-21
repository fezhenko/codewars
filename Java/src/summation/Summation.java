package summation;

public class Summation {

    public static int summation(int n) {

        int counter = 0;
        for (int i = 0; i <= n; i++) {
            counter += i;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(summation(2));
    }
}
