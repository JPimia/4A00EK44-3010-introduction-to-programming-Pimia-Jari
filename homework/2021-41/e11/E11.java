import java.io.Console;

public class E11 {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna pelialueen koko (10+)");
        int korkeus = Integer.parseInt(c.readLine());

        if(korkeus >= 10) {
            char[][] array = createBoard(korkeus);
            print(array);

            while(true){
                playerMovement(array, c);
            }
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
    public static int[] getPLayerPosition (char[][] myArray) {
        for(int i = 0; i < myArray.length; i++){

            for(int j = 0; j < myArray[i].length; j++) {
                if(myArray[i][j] == 'P'){
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
    public static void playerMovement (char[][] array, Console c) {
        System.out.println("Ylos, Alas, Oikea vai Vasen?");
        String pMovement = c.readLine();
        int[] playerPosition = getPLayerPosition(array);
        int newPlayerX = playerPosition[1];
        int newPlayerY = playerPosition[0];

        switch(pMovement.toLowerCase()){
            case "ylos":
                newPlayerY = newPlayerY-1;
                break;
            case "alas":
                newPlayerY = newPlayerY+1;
                break;
            case "vasen":
                newPlayerX = newPlayerX-1;
                break;
            case "oikee":
                newPlayerX = newPlayerX+1;
                break;
            default:
                return;
        }
        if(array[newPlayerY][newPlayerX] != 'X'){
            array[newPlayerY][newPlayerX] = 'P';
            array[playerPosition[0]][playerPosition[1]] = ' ';
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
