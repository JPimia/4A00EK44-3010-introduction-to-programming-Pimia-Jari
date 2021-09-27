import java.io.Console;

public class E5 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna kokonaisluku 1.");
        int numA = Integer.parseInt(c.readLine());

        System.out.println("Anna kokonaisluku 2.");
        int numB = Integer.parseInt(c.readLine());

        System.out.println("Vastaus on: " + laske(numA, numB));
        
    }

    public static int laske (int a, int b) {
        return a + b;
    }
}
