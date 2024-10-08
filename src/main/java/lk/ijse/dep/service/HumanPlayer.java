package lk.ijse.dep.service;

public class HumanPlayer extends Player{

    public HumanPlayer(Board board) {
        super(board);
    }

    public void movePiece(int col){
        if(board.isLegalMove(col)){
                board.updateMove(col,Piece.BLUE);
                board.getBoardUI().update(col,true);
                if(!board.findWinner().getWinningPiece().equals(Piece.EMPTY)){
                    board.getBoardUI().notifyWinner(board.findWinner());
                }else if(!board.existLegalMoves()){
                    board.getBoardUI().notifyWinner(new Winner(Piece.EMPTY));
                }
            }
    }
}
