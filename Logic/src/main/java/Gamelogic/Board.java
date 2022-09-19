package Gamelogic;

import Enums.Colour;
import Enums.Piecetype;
import Models.Piece;
import Models.Tile;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;

public class Board {
    private ArrayList<ArrayList<Tile>> board = new ArrayList<>();
    private Colour colour = Colour.Black;

    public Tile GetTile(String tilename){
        for (ArrayList<Tile> row : board)
            for (Tile tile : row)
                if(tile.getName().equals(tilename))
                    return tile;
        return null;
    }

    public void setPieceOnTile(String tilename, Piece piece) {
        //find the tile that is searched for
        for (ArrayList<Tile> row : board)
            for (Tile tile : row)
                if(tile.getName().equals(tilename))
                    //once found, place the piece on it
                    tile.setPiece(piece);
    }

    public void removePieceFromTile(String tilename){
        //find the tile that is searched for
        for (ArrayList<Tile> row : board)
            for (Tile tile : row)
                if(tile.getName().equals(tilename))
                    //once found, remove the piece
                    tile.removePiece();
    }

    public Board(){
        CreateTiles();
        PlacePieces();
    }

    private void CreateTiles() {
        String[] columns = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] rows = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};
        for (String column : columns){
            ArrayList<Tile> newRow = new ArrayList<>();
            for (String row : rows){
                //combine the row and column to create the name of the tile
                String name = column + row;
                Tile newTile = new Tile(colour, name);
                SwitchColour();
            }
            //this switch is to create a checker pattern instead of alle the columns the same colour
            SwitchColour();
            board.add(newRow);
        }
    }

    private ArrayList<Piece> CreatePieces() {
        ArrayList<Piece> pieces = new ArrayList<>();

        //White:
        //pawns
        for (int i = 0; i<8; i++){
            Piece piece = new Piece(Colour.White, Piecetype.Pawn);
            pieces.add(piece);
        }

        //2 of each and 1 Queen and 1 King
        pieces.add(new Piece(Colour.White, Piecetype.Rook));
        pieces.add(new Piece(Colour.White, Piecetype.Rook));
        pieces.add(new Piece(Colour.White, Piecetype.Horse));
        pieces.add(new Piece(Colour.White, Piecetype.Horse));
        pieces.add(new Piece(Colour.White, Piecetype.Bishop));
        pieces.add(new Piece(Colour.White, Piecetype.Bishop));

        pieces.add(new Piece(Colour.White, Piecetype.Queen));
        pieces.add(new Piece(Colour.White, Piecetype.King));

        //Black:
        //pawns
        for (int i = 0; i<8; i++){
            Piece piece = new Piece(Colour.Black, Piecetype.Pawn);
            pieces.add(piece);
        }

        //2 of each and 1 Queen and 1 King
        pieces.add(new Piece(Colour.Black, Piecetype.Rook));
        pieces.add(new Piece(Colour.Black, Piecetype.Rook));
        pieces.add(new Piece(Colour.Black, Piecetype.Horse));
        pieces.add(new Piece(Colour.Black, Piecetype.Horse));
        pieces.add(new Piece(Colour.Black, Piecetype.Bishop));
        pieces.add(new Piece(Colour.Black, Piecetype.Bishop));

        pieces.add(new Piece(Colour.Black, Piecetype.Queen));
        pieces.add(new Piece(Colour.Black, Piecetype.King));

        return pieces;
    }

    private void PlacePieces() {
        //before placing the pieces we first need to create them
        ArrayList<Piece> pieces = CreatePieces();
        //placing the white pawns
        setPieceOnTile("A2", pieces.get(0));
        setPieceOnTile("B2", pieces.get(1));
        setPieceOnTile("C2", pieces.get(2));
        setPieceOnTile("D2", pieces.get(3));
        setPieceOnTile("E2", pieces.get(4));
        setPieceOnTile("F2", pieces.get(5));
        setPieceOnTile("G2", pieces.get(6));
        setPieceOnTile("H2", pieces.get(7));

        //2 white rooks
        setPieceOnTile("A1", pieces.get(8));
        setPieceOnTile("H1", pieces.get(9));

        //2 white horses
        setPieceOnTile("B1", pieces.get(10));
        setPieceOnTile("G1", pieces.get(11));

        //2 white bishops
        setPieceOnTile("C1", pieces.get(12));
        setPieceOnTile("F1", pieces.get(13));

        //white queen
        setPieceOnTile("D1", pieces.get(14));

        //white king
        setPieceOnTile("E1", pieces.get(15));

        //black pawns
        setPieceOnTile("A7", pieces.get(16));
        setPieceOnTile("B7", pieces.get(17));
        setPieceOnTile("C7", pieces.get(18));
        setPieceOnTile("D7", pieces.get(19));
        setPieceOnTile("E7", pieces.get(20));
        setPieceOnTile("F7", pieces.get(21));
        setPieceOnTile("G7", pieces.get(22));
        setPieceOnTile("H7", pieces.get(23));

        //2 black rooks
        setPieceOnTile("A8", pieces.get(24));
        setPieceOnTile("H8", pieces.get(25));

        //2 black horses
        setPieceOnTile("B8", pieces.get(26));
        setPieceOnTile("G8", pieces.get(27));

        //2 black bishops
        setPieceOnTile("C8", pieces.get(28));
        setPieceOnTile("F8", pieces.get(29));

        //black queen
        setPieceOnTile("D8", pieces.get(30));

        //black king
        setPieceOnTile("E8", pieces.get(31));
    }

    private void SwitchColour(){
        //this method is used to alternate the color of the tiles for the board
        if (colour == Colour.Black)
            colour = Colour.White;
        else{
            colour = Colour.Black;
        }
        return;
    }
}
