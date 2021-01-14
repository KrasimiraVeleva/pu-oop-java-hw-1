package game;

import java.awt.*;

public class GameTile {

    private int row;
    private int col;
    private int tileSize = 100;

    public GameTile(int row, int col) {

        this.row      = row;
        this.col      = col;
        this.tileSize = 100;
    }

    //Този метод изобразява полетата на игралната дъска
    public void render(Graphics g) {

        int tileSize = 100;
        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;

        if ((this.row == 0 && this.col == 0) || (this.row == 0 && this.col == 4) || (this.row == 4 && this.col == 3) || (this.row == 4 && this.col == 1)) {
            g.setColor(Color.orange);
            g.fillRect(tileX, tileY, this.tileSize, this.tileSize);
        } else if ((this.row == 0 && this.col == 1) || (this.row == 4 && this.col == 4) || (this.row == 0 && this.col == 3) || (this.row == 4 && this.col == 0)) {
            g.setColor(Color.BLACK);
            g.fillRect(tileX, tileY, this.tileSize, this.tileSize);
        } else if ((this.row == 1 && this.col == 1) || (this.row == 1 && this.col == 0) || (this.row == 1 && this.col == 3) || (this.row == 1 && this.col == 4) ||
                   (this.row == 3 && this.col == 1) || (this.row == 3 && this.col == 0) || (this.row == 3 && this.col == 3) || (this.row == 3 && this.col == 4)) {
            g.setColor(Color.GRAY);
            g.fillRect(tileX, tileY, this.tileSize, this.tileSize);
        } else {
            g.setColor(Color.WHITE);
            g.fillRect(tileX, tileY, this.tileSize, this.tileSize);
        }
            g.setColor(Color.GRAY);
            g.fillOval(225,225,50,50);
    }
}