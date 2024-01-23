import java.util.Scanner;

public class TicTacToe {
    public static String[][] gameBoard = new String[3][3];
    static Scanner scan = new Scanner(System.in);

    public static boolean done2 = false;

    public static String player1 = "X";

    public static String player2 = "O";
    public static void main(String[] args) {
        int row1 = 1;
        int col1 = 1;
        int row2 = 0;
        int col2 = 0;
        boolean done = false;
        boolean p1Choice = false;
        boolean p2Choice = false;
        String yN = "";
        boolean p1Win = false;
        boolean p2Win = false;
        boolean tie = false;



        System.out.println("Welcome to Tic-Tac-Toe!");
        clearBoard();
        do {
            do {

                System.out.println("Player 1: ");
                row1 = Helper.getRangedInt(scan, "Enter your move row: ", 1, 3);
                col1 = Helper.getRangedInt(scan, "Enter your move col: ", 1, 3);
                p1Choice = isValidMove(row1 - 1, col1 - 1);
                if (p1Choice) {
                    gameBoard[row1 - 1][col1 - 1] = player1;
                    displayBoard();
                    done2 = true;
                }else{
                    System.out.println("Your input was invalid. Try again");
                }



            }while(!done2);
            p2Win = isWin(player2);
            p1Win = isWin(player1);
            tie = isTie();
            if(p2Win || p1Win || tie){
                done2 = true;
            }else{
                done2 = false;
            }

            do {
                if(done2){
                    break;
                }
                System.out.println("Player 2: ");
                row2 = Helper.getRangedInt(scan, "Enter your move row: ", 1, 3);
                col2 = Helper.getRangedInt(scan, "Enter your move col: ", 1, 3);
                p2Choice = isValidMove(row2 - 1, col2 - 1);
                if (p2Choice) {
                    gameBoard[row2 - 1][col2 - 1] = player2;
                    displayBoard();
                    done2 = true;
                }else{
                    System.out.println("Your input was invalid. Try again");
                }


            }while(!done2);
            p2Win = isWin(player2);
            p1Win = isWin(player1);
            tie = isTie();

            if(p2Win || p1Win || tie){
                done2 = true;
            }else{
                done2 = false;
            }

            if(p1Win){
                System.out.println("Player 1 Wins!");
            }else if(p2Win){
                System.out.println("Player 2 Wins!");
            }else if(tie){
                System.out.println("There is a tie!");
            }

            if(done2) {
                yN = Helper.getYNConfirm(scan, "Would you like to play again?");
                if (yN.equalsIgnoreCase("False")) {
                    done = true;
                }else{
                    clearBoard();
                }
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

    public static boolean isWin(String Player){
        boolean winm = false;

        if(isColWin(Player)){
            winm = true;
        }else if(isRowWin(Player)){
            winm = true;
        }else if(isDiagonalWin(Player)){
            winm = true;
        }else{
            winm = false;
        }




        return winm;
    }

    public static boolean isColWin(String Player){
        boolean win = false;


        if(gameBoard[0][0].equalsIgnoreCase(Player)
                && gameBoard[1][0].equalsIgnoreCase(Player)
                && gameBoard[2][0].equalsIgnoreCase(Player)
        ){
            win = true;
        } else if (gameBoard[0][1].equalsIgnoreCase(Player)
                && gameBoard[1][1].equalsIgnoreCase(Player)
                && gameBoard[2][1].equalsIgnoreCase(Player)) {
            win = true;
        } else if (gameBoard[0][2].equalsIgnoreCase(Player)
                && gameBoard[1][2].equalsIgnoreCase(Player)
                && gameBoard[2][2].equalsIgnoreCase(Player)) {
            win = true;
        }

        return win;
    }

    public static boolean isRowWin(String Player){
        boolean win = false;

        if(gameBoard[0][0].equalsIgnoreCase(Player)
                && gameBoard[0][1].equalsIgnoreCase(Player)
                && gameBoard[0][2].equalsIgnoreCase(Player)
        ){
            win = true;
        } else if (gameBoard[1][0].equalsIgnoreCase(Player)
                && gameBoard[1][1].equalsIgnoreCase(Player)
                && gameBoard[1][2].equalsIgnoreCase(Player)) {
            win = true;
        } else if (gameBoard[2][0].equalsIgnoreCase(Player)
                && gameBoard[2][1].equalsIgnoreCase(Player)
                && gameBoard[2][2].equalsIgnoreCase(Player)) {
            win = true;
        }

        return win;
    }

    public static boolean isDiagonalWin(String Player){
        boolean win = false;

        if(gameBoard[0][0].equalsIgnoreCase(Player)
                && gameBoard[1][1].equalsIgnoreCase(Player)
                && gameBoard[2][2].equalsIgnoreCase(Player)
        ){
            win = true;
        } else if (gameBoard[0][2].equalsIgnoreCase(Player)
                && gameBoard[1][1].equalsIgnoreCase(Player)
                && gameBoard[2][0].equalsIgnoreCase(Player)) {
            win = true;
        }

        return win;
    }

    public static boolean isTie(){
        boolean win = false;

        if(!gameBoard[0][0].equalsIgnoreCase("-")
                && !gameBoard[0][1].equalsIgnoreCase("-")
                && !gameBoard[0][2].equalsIgnoreCase("-")
                && !gameBoard[1][0].equalsIgnoreCase("-")
                && !gameBoard[1][1].equalsIgnoreCase("-")
                && !gameBoard[1][2].equalsIgnoreCase("-")
                && !gameBoard[2][0].equalsIgnoreCase("-")
                && !gameBoard[2][1].equalsIgnoreCase("-")
                && !gameBoard[2][2].equalsIgnoreCase("-")
        ){
            win = true;
        }
        return win;
    }

}
