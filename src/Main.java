import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String[][] gameBoard = new String[3][3];
            clearBoard();
            displayBoard();

        }

        public static void clearBoard() {
            String[][] gameBoard = new String[3][3];
            for (int i = 0; i < gameBoard.length; i++) {
                for (int j = 0; j < gameBoard.length; j++) {
                    gameBoard[i][j] = "-";
                }
            }
            System.out.println(gameBoard);
        }

        public static void displayBoard() {
            String[][] grid = new String[3][3];
            //Print out array
            //Outer for loop accesses each row
            for (int r = 0; r < grid.length; r++) {
                //Inner for loop accesses each column in the current row
                for (int c = 0; c < grid[0].length; c++) {
                    System.out.print(grid[r][c] + " ");
                }
                System.out.println();
            }
        }

    }

