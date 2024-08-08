package chess;

import boardgame.Board;
import chess.pieces.Bishop;
import chess.pieces.Horse;
import chess.pieces.King;
import chess.pieces.Pawn;
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
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	// INSTANCIA E DEFINE AS POSIÇÕES INICIAIS DAS PEÇAS NO TABULEIRO
	private void initialSetup() {
		// PEÇAS BRANCAS
		placeNewPiece('a', 8, new Roock(board, Color.WHITE)); 	//TORRE
		placeNewPiece('h', 8, new Roock(board, Color.WHITE));	//TORRE
		placeNewPiece('e', 8, new King(board, Color.WHITE));	//REI
		placeNewPiece('d', 8, new Queen(board, Color.WHITE));	//RAINHA
		placeNewPiece('c', 8, new Bishop(board, Color.WHITE));	//VALETE
		placeNewPiece('f', 8, new Bishop(board, Color.WHITE));	//VALETE
		placeNewPiece('b', 8, new Horse(board, Color.WHITE));	//CAVALO
		placeNewPiece('g', 8, new Horse(board, Color.WHITE));	//CAVALO
		placeNewPiece('a', 7, new Pawn(board, Color.WHITE));	//PEÃO
		placeNewPiece('b', 7, new Pawn(board, Color.WHITE));	//PEÃO
		placeNewPiece('c', 7, new Pawn(board, Color.WHITE));	//PEÃO
		placeNewPiece('d', 7, new Pawn(board, Color.WHITE));	//PEÃO
		placeNewPiece('e', 7, new Pawn(board, Color.WHITE));	//PEÃO
		placeNewPiece('f', 7, new Pawn(board, Color.WHITE));	//PEÃO
		placeNewPiece('g', 7, new Pawn(board, Color.WHITE));	//PEÃO
		placeNewPiece('h', 7, new Pawn(board, Color.WHITE));	//PEÃO
		
		// PEÇAS AMARELAS
		placeNewPiece('a', 1, new Roock(board, Color.BLACK)); 	//TORRE
		placeNewPiece('h', 1, new Roock(board, Color.BLACK));	//TORRE
		placeNewPiece('e', 1, new King(board, Color.BLACK));	//REI
		placeNewPiece('d', 1, new Queen(board, Color.BLACK));	//RAINHA
		placeNewPiece('c', 1, new Bishop(board, Color.BLACK));	//VALETE
		placeNewPiece('f', 1, new Bishop(board, Color.BLACK));	//VALETE
		placeNewPiece('b', 1, new Horse(board, Color.BLACK));	//CAVALO
		placeNewPiece('g', 1, new Horse(board, Color.BLACK));	//CAVALO
		placeNewPiece('a', 2, new Pawn(board, Color.BLACK));	//PEÃO
		placeNewPiece('b', 2, new Pawn(board, Color.BLACK));	//PEÃO
		placeNewPiece('c', 2, new Pawn(board, Color.BLACK));	//PEÃO
		placeNewPiece('d', 2, new Pawn(board, Color.BLACK));	//PEÃO
		placeNewPiece('e', 2, new Pawn(board, Color.BLACK));	//PEÃO
		placeNewPiece('f', 2, new Pawn(board, Color.BLACK));	//PEÃO
		placeNewPiece('g', 2, new Pawn(board, Color.BLACK));	//PEÃO
		placeNewPiece('h', 2, new Pawn(board, Color.BLACK));	//PEÃO
		
	}
	
	

}
