/*
 ============================================================================
 Name        : Main.java
 Author      : 3in1 Team
 Version     :
 Copyright   : 3in1 Team
 Description : 
 ============================================================================
 */
import java.util.Scanner;

public class Main   {
	
	public static void main(String[] args){
		Board game =new Board ();
		System.out.println("\n\t **Welcome to \"3in1\" Backgammon Game!**\n");
		game.gameStart();
		Board.Initialization();
		Board.gameimplementation();
	}
}
