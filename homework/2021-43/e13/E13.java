
/**
 * Basic application for checking if given int can be found in array or not.
 * 
 * @author Jari Pimia
 */

public class E13 {

    /**
     * Main method which calls for "find" method
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {1,2,8};
        int find = 2;
        System.out.println(find(array, find));
    }
    /**
     * Checks if value can be found in array
     * 
     * This method will do basic check if given value can be found in the array and returns boolean true or false.
     * @param array stores 3 int values.
     * @param value checks if can be found in array.
     * @return true or false.
     */
    public static boolean find(int [] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return true;
            } 
        }
        return false;
    }
}
