# sudoku

The project is a simple Sudoku board generator and player. It basically makes a finished and solved board of Sudoku and then transforms the board shifting and swapping numbers from rows and columns to randomly create a unique board.

At first the first few commits made the actual genertor and radomizer, and next then I made the actual player by moving and swapping some parts. 


Requirments: Java must be installed. (You can check if you have it installed by running "  java -version   ".

 If you want to set up locally and on any device make sure you installed java jdk from oracle, then clone this repo with git and run the .java file or just copy and paste the code into your ide and run it from your ide terminal all locally. 
 Otherwise, if you want to run from releases, open releases, and download the .jar file. After that open command prompt and cd into the folder you saved the .jar file to. Finally run the game using "   java -jar SudokuGenerator.jar   ". Look at first image to see example of me doing it. 

How to Play:
The board prints with . marking empty cells you need to fill in.
When prompted, type the row, then column, then the number (1-9) you think belongs there, separated by spaces or pressing Enter between each

The Sudoku board is generated through a mathematical formula to fill a 9x9 2D array. This formula ensures that every row and column and 3x3 square has the numbers 1-9 exactly once. This math formula basically staggers the numbers so that it fits in properly. Finally, for the scramble, the code uses several transformations like swaping number pairs, columns and rows throughout the entire board. This algorithim is completly random so a different board is made every time.

The files included in this project include the actual .java source code itself, this README, and a release under releases. 

Demo Image   

<img width="652" height="432" alt="image" src="https://github.com/user-attachments/assets/eec33342-1988-4200-82a5-03b54014fc8a" />

<img width="484" height="597" alt="image" src="https://github.com/user-attachments/assets/8f38851f-3551-4e1a-9b66-0a61d3cdd223" />
