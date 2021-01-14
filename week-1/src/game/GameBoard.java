package game;

import piece.Leader;
import piece.Guard;
import javax.swing.*;
import java.awt.*;

public class GameBoard extends JFrame {

    public GameBoard() {

        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    //@Author Красимира Велева
    //Този метод изобразява игралната дъска
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int row = 0; row < 5; row++) {
            for(int col = 0; col < 5; col++) {

                GameTile tile = new GameTile(row, col);
                tile.render(g);

                Leader l = new Leader(row, col);
                l.render(g);

                Guard g1 = new Guard(row, col);
                g1.render(g);

            }
        }
    }
}