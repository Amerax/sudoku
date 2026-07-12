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
        
     public static void scramble() {
        for (int i = 0; i < 10; i++) {
            int row = (int)(Math.random() * 3); 
            int r1 = row * 3 + (int)(Math.random() * 3);
            int r2 = row * 3 + (int)(Math.random() * 3);
            swapRows(r1, r2);
        }
    
        
        for (int i = 0; i < 10; i++) {
            int col = (int)(Math.random() * 3);
            int c1 = col * 3 + (int)(Math.random() * 3);
            int c2 =  col * 3 + (int)(Math.random() * 3);
            swapCols(c1, c2);
        }
    
        for (int i = 0; i < 10; i++) {
            int n1 = (int)(Math.random() * 9) + 1;
            int n2 = (int)(Math.random() * 9) + 1;
            swapNumbers(n1, n2);
        }
    }
    
    public static void swapRows(int r1, int r2) {
        for (int col = 0; col < 9; col++) {
            int temp = board[r1][col];
            board[r1][col] = board[r2][col];
            board[r2][col] = temp;
        }
    }
    
    public static void swapCols(int c1, int c2) {
        for (int row = 0; row < 9; row++) {
            int temp = board[row][c1];
            board[row][c1] = board[row][c2];
            board[row][c2] = temp;
        }
    }
    
    public static void swapNumbers(int n1, int n2) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == n1) {
                    board[row][col] = n2;
                } else if (board[row][col] == n2) {
                    board[row][col] = n1;
                }
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
    
   
}
