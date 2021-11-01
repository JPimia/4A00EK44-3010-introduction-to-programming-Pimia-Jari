import java.io.Console;
/**
 * Basic application that will print star sympols.
 * 
 * @author Jari Pimia
 */

public class E11 {
    /**
     * This is Main method that will use method call method printStars to print star symbols foe given amount.
     * @param args from commandline.
     */
    public static void main(String[] args) {
        Console c = System.console();
        String myName = "*";

        System.out.print("Monta tahti symbolia tulostetaan: ");
        int amount = Integer.parseInt(c.readLine());

        printStars(myName, amount);
    }

    /**
     * Prints given amount of star symbols.
     * 
     * Will print out star symbols for given amount.
     * @param name Printed variable.
     */
    public static void printStars (String star, int amount) {
        String stars = "";
        for(int i = 0; i < amount; i++) {
            stars += star;
        }
        System.out.print(stars);
    }
}