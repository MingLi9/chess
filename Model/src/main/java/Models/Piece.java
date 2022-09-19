package Models;

import Enums.Colour;
import Enums.Piecetype;

public class Piece {
    private Colour colour;
    private Piecetype piecetype;

    public Colour getColour() {
        return colour;
    }

    public Piecetype getPiecetype() {
        return piecetype;
    }

    public Piece() {
    }

    public Piece(Colour colour, Piecetype piecetype) {
        this.colour = colour;
        this.piecetype = piecetype;
    }
}
