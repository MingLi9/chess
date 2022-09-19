package Calculate;

import Enums.Colour;
import Gamelogic.Board;
import Models.Piece;

//Calculator decides if the move, that is recived, is a valid move for the piece that is selected
public class Calculator {
    private Board board;
    public Calculator(){

    }

    public boolean MovePiece(Board board, String fromLocation, String toLocation, Colour ownColour){
        this.board = board;

        //if there is not a valid piece on the from location the method will return false.
        if(!checkPieceAndColour(fromLocation, ownColour))
            return false;

        //check if there is a piece on the to location and if it is the correct colour
        Colour otherColour = SwitchColour(ownColour);
        if(pieceOnTile(toLocation))
            if(!checkPieceAndColour(toLocation, otherColour))
                return false;



        getChecked();

        return true;
    }

    private boolean pieceOnTile(String Location) {
        try{
            Piece targetPiece = board.GetTile(Location).getPiece();
            if (targetPiece == null)
                return true;
            return false;
        }
        catch (Exception ex){
            return false;
        }
    }

    private boolean checkPieceAndColour(String Location, Colour colour){
        try{
            Piece targetPiece = board.GetTile(Location).getPiece();
            if (targetPiece.getColour() == colour)
                return true;
            return false;
        }
        catch (Exception ex){
            return false;
        }
    }

    private Colour SwitchColour(Colour colour){
        if (colour == Colour.Black)
            return Colour.White;
        else
            return Colour.Black;
    }

    private boolean getChecked(){
        //Todo: create method to check if there is a check after a move is made
        return false;
    }

    private boolean getMated(){
        //Todo: create method to check if there is a mate after a move is made
        return false;
    }
}
