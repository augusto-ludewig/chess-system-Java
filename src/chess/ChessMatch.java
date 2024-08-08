package chess;

import boardgame.Board;
import boardgame.Position;
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
	
	private void initialSetup() { 	//POSIÇÕES INICIAIS DAS PEÇAS NO TABULEIRO
		// PEÇAS BRANCAS
		board.placePiece(new Roock(board, Color.WHITE), new Position(0, 0)); 	//CAVALO
		board.placePiece(new Roock(board, Color.WHITE), new Position(0, 7));	//CAVALO
		board.placePiece(new King(board, Color.WHITE), new Position(0, 4));
		board.placePiece(new Queen(board, Color.WHITE), new Position(0, 3));
		
		
		// PEÇAS PRETAS
		board.placePiece(new Roock(board, Color.BLACK), new Position(7, 0));
		board.placePiece(new Roock(board, Color.BLACK), new Position(7, 7));
		board.placePiece(new King(board, Color.BLACK), new Position(7, 4));
		board.placePiece(new Queen(board, Color.BLACK), new Position(7, 3));
		
	}
	
	

}
