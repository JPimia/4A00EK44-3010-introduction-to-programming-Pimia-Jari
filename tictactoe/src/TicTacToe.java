import java.io.Console;

/**
 * TecTacToe game.
 * 
 * @author Jari Pimiä
 */
public class TicTacToe {
    /**
     * Stores console for input.
     */
    private final static Console c = System.console();
    
    /**
     * Stores gameboard.
     */
    private char[][] gameBoard;

    /**
     * Stores which player is playing.
     */
    private int playerTurn;

    /**
     * Stores all player names.
     */
    private String[] playerNames = new String[2];

    /**
     * Stores amount of symbols needed to win the game.
     */
    private int need;

    /**
     * Stores X coordinate.
     */
    private int x = 1;

    /**
     * Stores Y coordinate.
     */
    private int y = 1;
    
    /**
     * Asks needed details to run the game.
     */
    private void askDetails() {
        boolean askDetails = false;
        boolean boardIsSet = false;
        boolean needInARow = false;
        System.out.println("---------------------------------");
        System.out.println("Welcome to play TicTacToe by Jari Pimiä!");
        while(!askDetails) {
            try {
                System.out.print("Give name for player1: ");
                playerNames[0] = c.readLine();
                System.out.println();
                System.out.print("Give name for player2: ");
                playerNames[1] = c.readLine();
                askDetails = true;
            } catch (Exception e) {
                System.out.print("Wrong argument.. Try again please: ");
            }
        }

        System.out.println("Give size for the gameboard: ");
        while(!boardIsSet) {
            try {
                size = Integer.parseInt(c.readLine());
                if(size > 9) {
                    System.out.print("Given input is too large, give new size for gameboard: ");
                } else if(size < 3) {
                    System.out.print("Given input is too small, give new size for gameboard: ");
                } else {
                    boardIsSet = true;
                }
            } catch (Exception e) {
                System.out.print("Wrong argument.. Only give numbers please: ");
            }
        }

        System.out.print("How many symbols is needed in a row: ");
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

    /**
     * Runs the game.
     */
    public void runGame() {
        createBoard();
        while(!isBoardFilled() && !checkWin()) {
            printBoard();
            checkTurns();
            movePlacement();
        }
        printBoard();
        if(!checkWin()) {
            System.out.println("Game is a Draw!");
        } else {
            System.out.println(getPlayerName() +  " is a winner!");
        }
    }
    
    /**
     * Creates the gameboard.
     */
    private void createBoard() {
        gameBoard = new char[size][size];

        for(int row = 0; row < gameBoard.length; row++) {
            for(int col = 0; col < gameBoard[row].length; col++) {
                gameBoard[row][col] = '-';
            }
        }
    }
    
    /**
     * Prints the gameboard.
     */
    private void printBoard() {
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

    /**
     * Checks whos turn it is.
     */
    private void checkTurns() {
        if(playerTurn == 0) {
            playerTurn++;
            playerTurn();
        } else {
            playerTurn = 0;
            computerTurn();
        } 
    }

    /**
     * Setup for player turn.
     */
    private void playerTurn() {
        boolean firstMove = true;
        
        System.out.println(getPlayerName() + "'s turn to give cordinates for X, Y: ");

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

    /**
     * Setup for computer turn.
     */
    private void computerTurn() {
        boolean isValid = false;
        System.out.println(getPlayerName() + " Played!");
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

    /**
     * Sets X and O symbols to gameboard.
     */
    private void movePlacement() {
            gameBoard[x][y] = getPlayerSymbol();
    }

    /**
     * Checks if board is filled.
     * 
     * @return True when gameboard is filled, false otherwise.
     */
    private boolean isBoardFilled() {

        for(int row = 0; row < gameBoard.length; row++) {
            for(int col = 0; col < gameBoard[row].length; col++) {
                if(gameBoard[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Checks if someone has won the game.
     * 
     * @return True if someone has won, false otherwise.
     */
    private boolean checkWin() { 
        char playerSymbol = getPlayerSymbol();
        return checkLines(playerSymbol) || checkAllDiagonals(playerSymbol);
    }

    /**
     * Checks if player or computer has won vertically or horizontally.
     * 
     * @param symbol Player symbol to check.
     * @return True if someone has won vertically or horizontally.
     */
    private boolean checkLines(char symbol) {
        int winVertical = 0;
        int winHorizontal = 0;
        int symbolsNeeded = need;

        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length; j++) {
                if(checkSymbol(i, j, symbol)) {
                    winHorizontal++;
                    if(winHorizontal == symbolsNeeded) {
                        return true;
                    }
                } else {
                    winHorizontal = 0;
                }
                if(checkSymbol(j, i, symbol)) {
                    winVertical++;
                    if(winVertical == symbolsNeeded) {
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

    /**
     * Checks if player or computer has won diagonally.
     * 
     * @param symbol Player symbol to check.
     * @return True if someone has won diagonally.
     */
    private boolean checkAllDiagonals(char symbol) {
        int symbolsNeeded = need;
        int[] countOfSymbols = new int[6];

        for (int i = 0; i < gameBoard.length; i++) {
            
            if (checkSymbol(i, i, symbol)) { //left to right middle diagonal
                countOfSymbols[0]++;

                if (countOfSymbols[0] == symbolsNeeded) {
                    return true;
                }
            } else {
                countOfSymbols[0] = 0;
            }
            if (checkSymbol(i, gameBoard.length - i - 1, symbol)) { //right to left middle diagonal
                countOfSymbols[1]++;

                if (countOfSymbols[1] == symbolsNeeded) {
                    return true;
                }
            } else {
                countOfSymbols[1] = 0;
            }

            if (i > 0 && i < gameBoard.length - 1) {
                for (int j = i; j < gameBoard[i].length; j++) {
                    if(checkSymbol(j, j - i, symbol)) { // Left to Right lower diagonals.
                        countOfSymbols[2]++;
                        
                        if (countOfSymbols[2] == symbolsNeeded) { 
                            return true;
                        }
                    } else {
                        countOfSymbols[2] = 0;
                    }
                    if(checkSymbol(j - i, j, symbol)) { // Left to Right upper diagonals.
                        countOfSymbols[3]++;
                        
                        if (countOfSymbols[3] == symbolsNeeded) { 
                            return true;
                        }
                    } else {
                        countOfSymbols[3] = 0;
                    }
                    if(checkSymbol(gameBoard.length - 1 - j, j - i, symbol)) { // Right to Left lower diagonals.
                        countOfSymbols[4]++;
                        
                        if (countOfSymbols[4] == symbolsNeeded) { 
                            return true;
                        }
                    } else {
                        countOfSymbols[4] = 0;
                    }
                    if(checkSymbol(gameBoard.length - 1 - j + i, j, symbol)) { // Right to Left upper diagonals.
                        countOfSymbols[5]++;
                        
                        if (countOfSymbols[5] == symbolsNeeded) { 
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
        }
        return false;
    }

    /**
     * Checks if given symbol is found in the gameboard.
     * 
     * @param row Row to check.
     * @param col Column to check.
     * @param symbol Player symbol to check.
     * @return True if symbol is found in gameboard, false otherwise.
     */
    private boolean checkSymbol (int row, int col, char symbol) {
        if(row >= 0 && row < gameBoard.length && col >= 0 && col < gameBoard[row].length) {
            return gameBoard[row][col] == symbol;
        }
        return false;
    }

    /**
     * Gets player symbol.
     * 
     * @return 'X' if playerturn is 0, otherwise returns 'O'.
     */
    private char getPlayerSymbol() {
        if(playerTurn == 0) {
            return 'X';
        } else {
            return 'O';
        }
    }

    /**
     * Gets player name.
     * 
     * @return Player name with symbol as a String.
     */
    private String getPlayerName () {
        return playerNames[playerTurn] + " (" + getPlayerSymbol() + ")";
    }
    
    /**
     * Main method.
     * 
     * @param args Program arguments.
     */
    public static void main(String args[]) {
        TicTacToe game = new TicTacToe();
        game.askDetails();
        game.runGame();
    }
}