package Models;

import Enums.Colour;

public class Tile {
    private Piece piece;
    private Colour colour;
    private String name;

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void removePiece(){
        this.piece = null;
    }

    public Colour getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public Tile(Colour colour, String name) {
        this.colour = colour;
        this.name = name;
    }
}
