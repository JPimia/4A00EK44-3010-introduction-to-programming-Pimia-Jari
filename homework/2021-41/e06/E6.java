import java.io.Console;

public class E6 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna taulukon koko");
        int numbers = Integer.parseInt(c.readLine());
        System.out.println("Anna taulukon koko");
        int numbers2 = Integer.parseInt(c.readLine());
        int[][] array = new int [numbers][numbers2];

        for(int i = 0; i < array.length; i++) {
            
            for(int j = 0; j < array[i].length; j++) {
                System.out.println("Anna taulukoille numerot");
                numbers2 = Integer.parseInt(c.readLine());
                array[i][j] = numbers2;
            }
        }
        printTwoDimArray(array);

    }
    public static void printTwoDimArray(int [][] myarray) {
        for(int i = 0; i < myarray.length; i++) {
            
            for(int j = 0; j < myarray[i].length; j++) {
                System.out.print(myarray[i][j]);
            }
            System.out.println();
        }
    }
}
