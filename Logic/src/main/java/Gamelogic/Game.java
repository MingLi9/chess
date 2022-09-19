package Gamelogic;

import Calculate.Calculator;
import Enums.Colour;
import Models.Piece;
import Models.Tile;

public class Game {
    //turn = true means that it is the player to make a move. when false its the AI or we expect the opponent to send a websocket msg.
    private Boolean turn = true;
    private Colour ownColour = Colour.White;
    private Board board;
    private Calculator calculator;
    //ToDo: build and make an instance of communicator
    //ToDo: when creating a game with an other player, make sure that one of the players is set to owncolour = black

    public Game(){
        board = new Board();
        calculator = new Calculator();
    }

    public void MovePiece(String fromLocation, String toLocation){
        //validate the input
        if(Valid(fromLocation) && Valid(toLocation)){
            //Both inputs are correctly formatted
            //send to Calculator to handle the other checks
            if(calculator.MovePiece(board, fromLocation, toLocation, ownColour)){
                //if the move can be made we actualy have to change the tiles
                Piece movablePiece = board.GetTile(fromLocation).getPiece();
                board.removePieceFromTile(fromLocation);
                board.setPieceOnTile(toLocation, movablePiece);
                //after the move is made, the turn has to swap
                turn = !turn;
            }
        }
        return;
    }

    private boolean Valid(String location){
        //if its not this players turn we need to refuse
        if (!turn)
            return false;

        Tile tile = board.GetTile(location);
        if(tile.getName() == location)
                return true;
        return false;
    }
}
