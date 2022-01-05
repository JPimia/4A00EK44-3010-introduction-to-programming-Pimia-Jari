import java.io.Console;

public class TicTacToe {
    Console c = System.console();
    
    private char[][] gameBoard;
    private int playerTurn;
    private String[] playerNames = new String[2];
    private int size = 6;
    private int need;
    private int x, y = 1;
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
        while(!isBoardFilled() && !checkWin()) {
            printBoard();
            checkTurns();
            movePlacement();
        }
        printBoard();
        
    }
    
    public void createBoard() { //Luodaan Pelikenttä
        gameBoard = new char[size][size];

        for(int row = 0; row < gameBoard.length; row++) {
            for(int col = 0; col < gameBoard[row].length; col++) {
                gameBoard[row][col] = '-';
            }
        }
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
                System.out.print(gameBoard[row][col]);
                if(col < gameBoard[row].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        
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

    public void playerTurn() { //Pelaajan vuoro antaa X ja Y
        boolean firstMove = true;
        
        System.out.println(playerNames[playerTurn] + "'s turn to give cordinates for X, Y: ");

        while(firstMove || x > size - 1 || y > size - 1 || x < 0 || y < 0 || gameBoard[x][y] != '-') {
            if(!firstMove) {
                System.out.println("Can't place symbol here, try again: ");
            }
            try {
                x = Integer.parseInt(c.readLine())-1;
                y = Integer.parseInt(c.readLine())-1;
            } catch (Exception e) {
                continue;
            }
            firstMove = false;
        }
    }

    public void computerTurn() { //Tietokone arpoo X ja Y
        boolean isValid = false;
        System.out.println(playerNames[playerTurn] + " Played!");
        while(!isValid) {
            int randomX = (int) (Math.random() * gameBoard.length);
            int randomY = (int) (Math.random() * gameBoard.length);
            if(gameBoard[randomX][randomY] == '-') {
                x = randomX;
                y = randomY;
                isValid = true;
            }
        }
    }

    public void movePlacement() { // Asetetaan X tai O Pelikentälle
            gameBoard[x][y] = getPlayerSymbol();
    }
    
    private boolean isBoardFilled() { //Tarkistetaan onko tasapeli
        
        for(int row = 0; row < gameBoard.length; row++) {
            for(int col = 0; col < gameBoard[row].length; col++) {
                if(gameBoard[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin() {
        char playerSymbol = getPlayerSymbol();

        return checkLines(playerSymbol) || /*checkDiagonals(playerSymbol) ||*/ checkAllDiagonals(playerSymbol);
    }

    private boolean checkLines(char symbol) {
        int winVertical = 0;
        int winHorizontal = 0;
        int symbolsNeeded = need;

        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length; j++) {
                if(gameBoard[i][j] == symbol) {
                    winHorizontal++;
                    if(winHorizontal == symbolsNeeded) {
                        System.out.println("voitit vaaka");
                        return true;
                    }
                } else {
                    winHorizontal = 0;
                }
                if(gameBoard[j][i] == symbol) {
                    winVertical++;
                    if(winVertical == symbolsNeeded) {
                        System.out.println("voitit pysty");
                        return true;
                    }
                } else {
                    winVertical = 0;
                }
            }
            winHorizontal = 0;
            winVertical = 0;
        }
        return false;
    }

    /*private boolean checkDiagonals(char symbol) {
        int diagLeft = 0;
        int diagRight = 0;
        int symbolsNeeded = need;

        for(int i = 0; i < gameBoard.length; i++) {
            if(gameBoard[i][i] == symbol) {
                diagLeft++;
                if(diagLeft == symbolsNeeded) {
                    System.out.println("voitit vaaka");
                    return true;
                }
            } else {
                diagLeft = 0;
            }
            if(gameBoard[i][gameBoard.length-i-1] == symbol) {
                diagRight++;
                if(diagRight == symbolsNeeded) {
                    System.out.println("voitit pysty");
                    return true;
                }
            } else {
                diagRight = 0;
            }
        }
        return false;
    }*/
    private boolean checkAllDiagonals(char symbol) {
        int symbolsNeeded = need;
        int[] countOfSymbols = new int[6];

        for (int i = 0; i < gameBoard.length; i++) {
            
                // down and right
                    if (gameBoard[i][i] == symbol) {
                        countOfSymbols[0]++;
        
                        if (countOfSymbols[0] == symbolsNeeded) {
                            System.out.println("poikittain voitti");
                            return true;
                        }
                    } else {
                        countOfSymbols[0] = 0;
                    }
                    if (gameBoard[i][gameBoard.length - i - 1] == symbol) {
                        countOfSymbols[1]++;
        
                        if (countOfSymbols[1] == symbolsNeeded) {
                            System.out.println("poikittain voitti");
                            return true;
                        }
                    } else {
                        countOfSymbols[1] = 0;
                    }

                    
                    if (i > 0 && gameBoard.length - 1 - i < symbolsNeeded) {
                        for (int j = i; j < gameBoard[i].length; j++) {
                            if(gameBoard[j][j - i] == symbol) { // Left to Right lower diagonals.
                                countOfSymbols[2]++;
        
                                if (countOfSymbols[2] == symbolsNeeded) { 
                                    System.out.println("poikittain voitti");
                                    return true;
                                }
                            } else {
                                countOfSymbols[2] = 0;
                            }
                            if(gameBoard[j - i][j] == symbol) { // Left to Right upper diagonals.
                                countOfSymbols[3]++;
        
                                if (countOfSymbols[3] == symbolsNeeded) { 
                                    System.out.println("poikittain voitti");
                                    return true;
                                }
                            } else {
                                countOfSymbols[3] = 0;
                            }
                            if(gameBoard[gameBoard.length - 1 - i][j - i] == symbol) { // Right to Left lower diagonals.
                                countOfSymbols[4]++;
        
                                if (countOfSymbols[4] == symbolsNeeded) { 
                                    System.out.println("poikittain voitti");
                                    return true;
                                }
                            } else {
                                countOfSymbols[4] = 0;
                            }
                            if(gameBoard[gameBoard.length - 1 + i][j] == symbol) { // Right to Left upper diagonals.
                                countOfSymbols[5]++;
        
                                if (countOfSymbols[5] == symbolsNeeded) { 
                                    System.out.println("poikittain voitti");
                                    return true;
                                }
                            } else {
                                countOfSymbols[5] = 0;
                            }
                            
                        }
                        countOfSymbols[2] = 0;
                        countOfSymbols[3] = 0;
                        countOfSymbols[4] = 0;
                        countOfSymbols[5] = 0;
                    }

                    
                
                    
                
        
                // down and left
                
            
        }
        return false;
    }

    public char getPlayerSymbol() {
        if(playerTurn == 0) {
            return 'X';
        } else {
            return 'O';
        }
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