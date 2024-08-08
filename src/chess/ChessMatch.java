package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Queen;
import chess.pieces.Roock;

// Classe com as regras do jogo

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) {
			for(int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		} return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placeNewPiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	// INSTANCIA E DEFINE AS POSIÇÕES INICIAIS DAS PEÇAS NO TABULEIRO
	private void initialSetup() {
		// PEÇAS BRANCAS
		placeNewPiece('a', 8, new Roock(board, Color.WHITE)); 	//TORRE
		placeNewPiece('h', 8, new Roock(board, Color.WHITE));	//TORRE
		placeNewPiece('e', 8, new King(board, Color.WHITE));		//REI
		placeNewPiece('d', 8, new Queen(board, Color.WHITE));	//RAINHA
		
		/*
		// PEÇAS PRETAS
		board.placePiece(new Roock(board, Color.BLACK), new Position(7, 0));	//TORRE
		board.placePiece(new Roock(board, Color.BLACK), new Position(7, 7));	//TORRE
		board.placePiece(new King(board, Color.BLACK), new Position(7, 4));		//REI
		board.placePiece(new Queen(board, Color.BLACK), new Position(7, 3));	//RAINHA
		*/
	}
	
	

}
