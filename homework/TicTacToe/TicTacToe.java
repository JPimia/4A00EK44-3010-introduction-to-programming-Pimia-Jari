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

        while(need > size) {
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
        checkTurns(playerTurn);
    }

    public void checkTurns(int playerTurn) {
        if(playerTurn == 0) {
            playerTurn();
        } else {
            computerTurn();
            playerTurn = 0;
        } 
    }

    public void playerTurn() {
        System.out.print(playerNames[playerTurn] + "'s turn to give cordinates for X, Y: ");
        x = Integer.parseInt(c.readLine());
        y = Integer.parseInt(c.readLine());

        if(x > size || y > size) {
            System.out.println("Wrong position, give new one: ");
            x = Integer.parseInt(c.readLine());
            y = Integer.parseInt(c.readLine());
        } 
        playerTurn++;
        movePlacement(playerTurn, gameBoard);
    }

    public void computerTurn() {
        System.out.print(playerNames[playerTurn] + " Played!");
        x = (int) (Math.random() * gameBoard.length);
        y = (int) (Math.random() * gameBoard.length);
        movePlacement(playerTurn, gameBoard);
    }

    public void movePlacement(int playerTurn, char[][] gameBoard) {
        if(playerTurn == 0) {
            gameBoard[x][y] = 'X';
        } else if(playerTurn == 1) {
            gameBoard[x][y] = 'O';
        }
        printBoard(size);
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