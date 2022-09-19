package Gamelogic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BoardTest {

    private Board board;
    @BeforeAll
    void initialize(){
        board = new Board();
    }

    @Test
    void Board() {
        board.GetTile("A1");
        board.GetTile("H8");
    }
}