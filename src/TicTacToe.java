import java.util.Scanner;

public class TicTacToe {
    public static String[][] gameBoard = new String[3][3];
    static Scanner scan = new Scanner(System.in);

    public static boolean done2 = false;
    public static void main(String[] args) {
        int row1 = 1;
        int col1 = 1;
        int row2 = 0;
        int col2 = 0;
        boolean done = false;
        boolean p1Choice = false;
        boolean p2Choice = false;
        String yN = "";



        System.out.println("Welcome to Tic-Tac-Toe!");
        clearBoard();
        do {
            for(int i = 0; i < gameBoard.length; i++){
                for(int j = 0; i < gameBoard.length; j++)
            }

            do {
                System.out.println("Player 1: ");
                row1 = Helper.getRangedInt(scan, "Enter your move row: ", 1, 3);
                col1 = Helper.getRangedInt(scan, "Enter your move col: ", 1, 3);
                p1Choice = isValidMove(row1 - 1, col1 - 1);
                if ( p1Choice == true) {
                    gameBoard[row1 - 1][col1 - 1] = "X";
                    displayBoard();
                    done2 = true;
                }else{
                    System.out.println("Your input was invalid. Try again");
                }

            }while(!done2);
            done2 = false;
            do {
                System.out.println("Player 2: ");
                row2 = Helper.getRangedInt(scan, "Enter your move row: ", 1, 3);
                col2 = Helper.getRangedInt(scan, "Enter your move col: ", 1, 3);
                p2Choice = isValidMove(row2 - 1, col2 - 1);
                if ( p2Choice == true) {
                    gameBoard[row2 - 1][col2 - 1] = "O";
                    displayBoard();
                    done2 = true;
                }else{
                    System.out.println("Your input was invalid. Try again");
                }

            }while(!done2);

            done2 = false;



            yN = Helper.getYNConfirm(scan, "Would you like to continue?");
            if(yN.equalsIgnoreCase("False")){
                done = true;
            }

        }while(!done);



    }

    private static void clearBoard() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                gameBoard[i][j] = "-";
            }

        }
    }

    private static void displayBoard() {
        //Print out array
        //Outer for loop accesses each row
        for (int r = 0; r < gameBoard.length; r++) {
            //Inner for loop accesses each column in the current row
            for (int c = 0; c < gameBoard.length; c++) {
                System.out.print(gameBoard[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int row, int col){
        boolean tF = true;
        if(gameBoard[row][col].equalsIgnoreCase("X") || gameBoard[row][col].equalsIgnoreCase("O")){
            tF = false;
        }else{
            tF = true;
        }
        return tF;
    }

    public static boolean isWin(){
        boolean win = false;
        
        
        
        
        return win;
    }

    public static boolean isColWin(){
        boolean win = false;
        
        
        if(gameBoard[1][1].equalsIgnoreCase("X") 
                && gameBoard[2][1].equalsIgnoreCase("X")
                && gameBoard[3][1].equalsIgnoreCase("X")
        ){
            win = true;
        } else if (gameBoard[1][2].equalsIgnoreCase("X")
                && gameBoard[2][2].equalsIgnoreCase("X")
                && gameBoard[3][2].equalsIgnoreCase("X")) {
            win = true;
        } else if (gameBoard[1][3].equalsIgnoreCase("X")
                && gameBoard[2][3].equalsIgnoreCase("X")
                && gameBoard[3][3].equalsIgnoreCase("X")) {
            win = true;
        }

        return win;
    }

    public static boolean isRowWin(){
        boolean win = false;

        if(gameBoard[1][1].equalsIgnoreCase("X")
                && gameBoard[1][2].equalsIgnoreCase("X")
                && gameBoard[1][3].equalsIgnoreCase("X")
        ){
            win = true;
        } else if (gameBoard[2][1].equalsIgnoreCase("X")
                && gameBoard[2][2].equalsIgnoreCase("X")
                && gameBoard[2][3].equalsIgnoreCase("X")) {
            win = true;
        } else if (gameBoard[3][1].equalsIgnoreCase("X")
                && gameBoard[3][2].equalsIgnoreCase("X")
                && gameBoard[3][3].equalsIgnoreCase("X")) {
            win = true;
        }
        
        return win;
    }

    public static boolean isDiagonalWin(){
        boolean win = false;

        if(gameBoard[1][1].equalsIgnoreCase("X")
                && gameBoard[2][2].equalsIgnoreCase("X")
                && gameBoard[3][3].equalsIgnoreCase("X")
        ){
            win = true;
        } else if (gameBoard[1][3].equalsIgnoreCase("X")
                && gameBoard[2][2].equalsIgnoreCase("X")
                && gameBoard[3][1].equalsIgnoreCase("X")) {
            win = true;
        } 
        
        return win;
    }

    public static boolean isTie(){
            boolean win = false;
            
        if(gameBoard[1][1].equalsIgnoreCase("X")
                && gameBoard[2][1].equalsIgnoreCase("X")
                && gameBoard[3][1].equalsIgnoreCase("X")
        ){
            win = false;
        } else if (gameBoard[1][2].equalsIgnoreCase("X")
                && gameBoard[2][2].equalsIgnoreCase("X")
                && gameBoard[3][2].equalsIgnoreCase("X")) {
            win = false;
        } else if (gameBoard[1][3].equalsIgnoreCase("X")
                && gameBoard[2][3].equalsIgnoreCase("X")
                && gameBoard[3][3].equalsIgnoreCase("X")) {
            win = false;
        }else if(gameBoard[1][1].equalsIgnoreCase("X")
                && gameBoard[1][2].equalsIgnoreCase("X")
                && gameBoard[1][3].equalsIgnoreCase("X")
        ){
            win = false;
        } else if (gameBoard[2][1].equalsIgnoreCase("X")
                && gameBoard[2][2].equalsIgnoreCase("X")
                && gameBoard[2][3].equalsIgnoreCase("X")) {
            win = false;
        } else if (gameBoard[3][1].equalsIgnoreCase("X")
                && gameBoard[3][2].equalsIgnoreCase("X")
                && gameBoard[3][3].equalsIgnoreCase("X")) {
            win = false;
        }else if(gameBoard[1][1].equalsIgnoreCase("X")
                && gameBoard[2][2].equalsIgnoreCase("X")
                && gameBoard[3][3].equalsIgnoreCase("X")
        ){
            win = false;
        } else if (gameBoard[1][3].equalsIgnoreCase("X")
                && gameBoard[2][2].equalsIgnoreCase("X")
                && gameBoard[3][1].equalsIgnoreCase("X")) {
            win = false;
        }else{
            win = true;
        }
        
        return win;
    }

}
