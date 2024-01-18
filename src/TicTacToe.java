import java.util.Scanner;
public class TicTacToe {
     static String[][] gameBoard = new String[3][3];
     static Scanner scan = new Scanner(System.in);
        public static void main(String[] args) {



            System.out.println("Welcome to Tic-Tac-Toe!");
            System.out.println("Player 1: ");
            isValidMove();




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

        private static void isValidMove(int row, int col){
            row = Helper.getRangedInt(scan, "Enter your move row: ", 1, 3);
            col = Helper.getRangedInt(scan, "Enter your move column: ",1,3);

        }



    }

