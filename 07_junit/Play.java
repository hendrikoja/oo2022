package kodu;

import java.io.*;
import java.util.*;

public class Play {
	
	public static void drawBoard(Board board) {
		//Visualize the board
	}
	
    public static void main(String[] args) {
        //Main game loop
		Board gameBoard = new Board();
		
		gameBoard.place(1, 0, 1);
		gameBoard.place(1, 1, 1);
		gameBoard.place(1, 2, 1);
		
		System.out.println(Arrays.deepToString(gameBoard.playarea));
		
		System.out.println(gameBoard.checkWin());
    }
}
