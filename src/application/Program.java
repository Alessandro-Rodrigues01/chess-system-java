package application;

import java.util.Scanner;

import boardgame.Board;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			try {
			UI.clearScreen();
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessposition(sc);
			
			System.out.println();
			System.out.print("target: ");
			ChessPosition target = UI.readChessposition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}

}
