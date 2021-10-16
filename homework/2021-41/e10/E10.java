import java.io.Console;

public class E10 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna pelialueen koko (10+)");
        int korkeus = Integer.parseInt(c.readLine());

        if(korkeus >= 10) {
            char[][] array = createBoard(korkeus);
            print(array);
        }
    }
    public static char[][] createBoard (int korkeus) {
        char[][] myArray = new char[korkeus][korkeus];

        for(int i = 0; i < myArray.length; i++){

            for(int j = 0; j < myArray[i].length; j++) {
                if(i == 0 || i == myArray.length - 1 || j == 0 || j == myArray.length - 1){
                    myArray[i][j] = 'X';
                } else if(i == myArray.length / 2 && j == myArray.length / 2) {
                    myArray[i][j] = 'P';
                } else {
                    myArray[i][j] = ' ';
                }
            }
        }
        return myArray;
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
