import java.io.Console;

public class E5 {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Anna lukuja taulukkoon");
        
        int[][] array = new int [2][3];

        for(int i = 0; i < array.length; i++) {
            
            for(int j = 0; j < array[i].length; j++) {
                int numbers = Integer.parseInt(c.readLine());
                array[i][j] += numbers;
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
