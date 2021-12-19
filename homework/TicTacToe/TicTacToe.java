import java.io.Console;

import javax.print.attribute.Size2DSyntax;

public class TicTacToe {
    Console c = System.console();
    
    private char[][] gameBoard;
    private int playerTurn;
    private String[] playerNames = new String[2];
    private int size = 6;
    private int need;
    private int x, y = 1;
    private boolean isValid;
    private boolean boardSize, askDetails, needInARow;
    

    public void askDetails() { // Kysytään pelin aloittamiseen tarvittavat asiat
        System.out.println("---------------------------------");
        System.out.println("Tervetuloa pelaamaan ristinollaa!");
        while(!askDetails) {
            try {
                System.out.print("Anna pelaajalle 1 nimi: ");
                playerNames[0] = c.readLine();
                System.out.println();
                System.out.print("Anna pelaajalle 2 nimi: ");
                playerNames[1] = c.readLine();
                askDetails = true;
            } catch (Exception e) {
                System.out.print("Wrong argument.. Try again please: ");
            }
            
        }

        System.out.println("Anna pelialustan koko: ");
        while(!boardSize) {
            try {
                size = Integer.parseInt(c.readLine());
                if(size > 9) {
                    System.out.print("Liian suuri pelilauta, anna uusi pelilaudan koko: ");
                } else if(size < 3) {
                    System.out.print("Liian pieni pelilauta, anna uusi pelilaudan koko: ");
                } else {
                    boardSize = true;
                }
            } catch (Exception e) {
                System.out.print("Wrong argument.. Only give numbers please: ");
                
                
            }
            
        }

        System.out.print("Montako perakkain tarvitaan voittoon: ");
        while(!needInARow) {
            try {
                need = Integer.parseInt(c.readLine());
                if(need > size) {
                    System.out.print("Symbols needed cant exceed board size, please give new one: ");
                } else if(need < 3) {
                    System.out.print("Symbols needed cant be lower than 3, please give new one: ");
                } else {
                    needInARow = true;
                }
            } catch (Exception e) {
                System.out.print("Wrong argument, give numbers only please: ");
            }
        }
    }
    
    public void runGame() { //ajetaan peliä
        createBoard();
            while(true) {
                printBoard();
                checkTurns();
                isValidMove();
                if(!isValid) {
                    movePlacement();
                } 
            }
        

        
        
        /*while(!checkWin('O') && !isBoardFilled()) {
            break;
        }*/
    }
    
    public void createBoard() { //Luodaan Pelikenttä
        gameBoard = new char[size][size];
    }
    
    private void printBoard() { //Tulostetaan Pelikenttä
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
        if(gameBoard[x][y] == 'O' || gameBoard[x][y] == 'X') {
            playerTurn = 0;
            isValid = true;
        } else {
            isValid = false;
        }
        return false;
    }

    public void checkTurns() { //Tarkistetaan kenen vuoro
        if(playerTurn == 0) {
            playerTurn();
            playerTurn++;
        } else {
            computerTurn();
            playerTurn = 0;
        } 
    }

    public void playerTurn() { //Pelaaja vuoro antaa x, y
        
            System.out.println(playerNames[playerTurn] + "'s turn to give cordinates for X, Y: ");
            x = Integer.parseInt(c.readLine())-1;
            y = Integer.parseInt(c.readLine())-1;
        
        if(x > size || y > size ) {
            System.out.println("Can't position outside of gameboard, give new position: ");
            x = Integer.parseInt(c.readLine())-1;
            y = Integer.parseInt(c.readLine())-1;
        } 
    }

    public void computerTurn() { //Tietokone arpoo x, y
        System.out.println(playerNames[playerTurn] + " Played!");
        x = (int) (Math.random() * gameBoard.length);
        y = (int) (Math.random() * gameBoard.length);
        
        
    }

    public void movePlacement() { // Asetetaan X tai O Pelikentälle
        if(playerTurn == 0) {
            gameBoard[x][y] = 'X';
        } else if(playerTurn == 1) {
            gameBoard[x][y] = 'O';
        }
    }
    
    private boolean isBoardFilled() { //Tarkistetaan onko tasapeli
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