import java.io.Console;

public class TicTacToe {
    Console c = System.console();
    
    private char[][] gameBoard;
    private int playerTurn;
    private String[] playerNames = new String[2];
    private int size = 6;
    private int need;
    private int x, y = 1;
    private boolean isValid;
    

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
        createBoard();
        if(size < 10 && size > 3) {
            while(true) {
                printBoard();
                checkTurns();
                isValidMove();
                if(isValid) {
                    movePlacement();
                }
            }
        }

        
        
        /*while(!checkWin('O') && !isBoardFilled()) {
            break;
        }*/
    }
    
    public void createBoard() {
        gameBoard = new char[size][size];
    }
    
    private void printBoard() {
        System.out.print('0');
        for(int i = 0; i < gameBoard.length; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for(int row = 0; row < gameBoard.length; row++) {
            
                System.out.print((row + 1) + " ");
            
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

    public boolean isValidMove() { //tarkastaa onko ruutu vapaa
        if(gameBoard[x][y] != '-') {
            return true;
        } 
        return false;
    }

    public void checkTurns() {
        if(playerTurn == 0) {
            playerTurn();
            playerTurn++;
        } else {
            computerTurn();
            playerTurn = 0;
        } 
    }

    public void playerTurn() {
        
            System.out.println(playerNames[playerTurn] + "'s turn to give cordinates for X, Y: ");
            x = Integer.parseInt(c.readLine())-1;
            y = Integer.parseInt(c.readLine())-1;
        
        if(x > size || y > size ) {
            System.out.println("Can't position outside of gameboard, give new position: ");
            x = Integer.parseInt(c.readLine())-1;
            y = Integer.parseInt(c.readLine())-1;
        } 
    }

    public void computerTurn() {
        System.out.println(playerNames[playerTurn] + " Played!");
        x = (int) (Math.random() * gameBoard.length);
        y = (int) (Math.random() * gameBoard.length);
        
        
    }

    public void movePlacement() {
        if(playerTurn == 0) {
            gameBoard[x][y] = 'X';
        } else if(playerTurn == 1) {
            gameBoard[x][y] = 'O';
        }
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