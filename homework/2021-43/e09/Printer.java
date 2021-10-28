/**
 * Basic application that will print my name.
 * 
 * @author Jari Pimia
 */

public class Printer {
    /**
     * This is Main method that will use method call method printText.
     * @param args from commandline.
     */
    public static void main(String[] args) {
        String myName = "Jari Pimia";
        printText(myName);
    }

    /**
     * Prints given name.
     * 
     * Will print out variable myName that is given in the main method.
     * @param name Printed variable.
     */
    public static void printText (String name) {
        System.out.println("My name is: " + name);
    }
}
