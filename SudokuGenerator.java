import java.util.Scanner;

public class SudokuGenerator
{
    static int[][] board = new int[9][9];
    
    public static void main(String[] args)
    {
        genBoard();
        printBoard();
        System.out.println("This is solved");
        
        scramble();
        printBoard();
        System.out.println("This is scrambled");

    }
    
    public static void genBoard() {
            for (int row = 0; row < 9; row++) {
                  for (int col = 0; col < 9; col++) {
                    board[row][col] = (row * 3 + row / 3 + col) % 9 + 1;
             }
          }
    }

 public static void printBoard() {
        System.out.println("----------------------");
        int rowCounter = 0;
        for (int i = 0; i < board.length; i++) {
            int counter = 0;
    
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
                counter++;
    
                if (counter == 3 && j != board[i].length - 1) {
                    System.out.print("| ");
                    counter = 0;
                }
            }
            System.out.println();
            rowCounter++;
            if(rowCounter == 3){
                System.out.println("----------------------");
                rowCounter = 0;
            }
            
        }
 }
