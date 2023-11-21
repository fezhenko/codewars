package even_or_odd;

public class EvenOrOdd {
    public static String evenOrOdd(int x) {
        return (x % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(evenOrOdd(7));
    }
}
