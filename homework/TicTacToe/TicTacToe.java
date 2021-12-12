import java.io.Console;

public class TicTacToe {
    Console c = System.console();
    
    private char[][] gameBoard;
    private int playerTurn;
    private String[] playerNames = new String[2];
    private int size = 6;
    private int need;
    private int x, y;
    

    public void askDetails() { // Kysytään pelin aloittamiseen tarvittavat asiat
        System.out.println("Tervetuloa pelaamaan ristinollaa, anna pelaajalle 1 nimi: ");
        playerNames[0] = c.readLine();
        System.out.println("Anna pelaajalle 2 nimi: ");
        playerNames[1] = c.readLine();

        System.out.println("Anna pelialustan koko: ");
        size = Integer.parseInt(c.readLine());
        System.out.println("Montako perakkäin tarvitaan voittoon? ");
        need = Integer.parseInt(c.readLine());

        if(need > size) {
            throw new IllegalArgumentException("Ei voi ylittaa pelilaudan kokoa!");
        } else {
            System.out.println("Anna uusi tarvittava maara: ");
            need = Integer.parseInt(c.readLine());
        }
    }
    
    public void runGame() { 
        
        createBoard(size);

        
        /*while(!checkWin('O') && !isBoardFilled()) {
            break;
        }*/
    }
    
    public void createBoard(int size) {
        gameBoard = new char[size][size];
        printBoard(size);
    }
    
    private void printBoard(int size) {
        for(int row = 0; row < gameBoard.length; row++) {
            for(int col = 0; col < gameBoard[row].length; col++) {
                if(gameBoard[row][col] == 0) {
                    System.out.print("-");
                } else {
                    System.out.print(gameBoard[row][col]);
                }
                
                if(col < gameBoard[row].length - 1) {
                    System.out.print("|");
                }
            }
            
            System.out.println();
        }
    }

    public void playerTurn(int playerTurn) {
        System.out.print("Play" + playerNames[playerTurn] + ": ");
        x = Integer.parseInt(c.readLine());
        y = Integer.parseInt(c.readLine());

        if(x > size || y > size) {
            throw new IllegalArgumentException("Wrong position, give new one: ")
        } else {
            x = Integer.parseInt(c.readLine());
            y = Integer.parseInt(c.readLine());
        }
        playerTurn++;
    }

    public void computerTurn(int playerTurn) {
        System.out.print("Computer plays" + playerNames[playerTurn] + ": ");
        x = (int) (Math.random() * gameBoard.length * gameBoard.length);
        y = (int) (Math.random() * gameBoard.length * gameBoard.length);
        playerTurn = 0;
    }

    public void movePlacement(String[] playerNames, char[][] gameBoard) {

    }
    
    private boolean isBoardFilled() {
        int emptyCells = gameBoard.length * gameBoard.length;

        for(int row = 0; row < gameBoard.length; row++) {
            for(int col = 0; col < gameBoard[row].length; col++) {
                if(gameBoard[row][col] != '-') {
                    emptyCells--;
                }
            }
        }

        return emptyCells == 0;
    }
    
    /*private boolean checkWin(char symbol) {
        return checkLines(symbol) || checkDiagonals(symbol);
    }*/
    
    public static void main(String args[]) {
        TicTacToe game = new TicTacToe();
        game.askDetails();
        game.runGame();
    }
    
}