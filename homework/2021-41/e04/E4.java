import java.io.Console;

public class E4 {
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
        for(int i = 0; i < array.length; i++) {
            
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
