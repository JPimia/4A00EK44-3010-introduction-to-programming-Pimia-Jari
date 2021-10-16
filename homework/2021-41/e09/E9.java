import java.io.Console;

public class E9 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna korkeus");
        int korkeus = Integer.parseInt(c.readLine());
        char[][] array = new char[korkeus][korkeus];

        for(int i = 0; i < array.length; i++){

            for(int j = 0; j < array[i].length; j++) {
                if(j == 0 || j == korkeus - 1 || i == j){
                    array[i][j] = 'X';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        print(array);
    }
    public static void print (char[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
