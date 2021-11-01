import java.io.Console;
/**
 * Basic application that will print my name 5 times.
 * 
 * @author Jari Pimia
 */

public class E10 {
    /**
     * This is Main method that will use method call method printText 5 times.
     * @param args from commandline.
     */
    public static void main(String[] args) {
        Console c = System.console();
        String myName = "Jari Pimia";

        System.out.print("Monta kertaa haluat tulostaa nimesi: ");
        int amount = Integer.parseInt(c.readLine());

        printText(myName, amount);
    }

    /**
     * Prints given name.
     * 
     * Will print out variable myName that is given in the main method.
     * @param name Printed variable.
     */
    public static void printText (String name, int amount) {
        for(int i = 0; i < amount; i++) {
            System.out.println("My name is: " + name);
        }
    }
}
