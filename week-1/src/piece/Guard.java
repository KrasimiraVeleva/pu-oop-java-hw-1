package piece;

import java.awt.*;

public class Guard {

    private int row;
    private int col;

    public Guard(int row, int col) {
        this.row = row;
        this.col = col;
    }

    //Този метод изобразява гардовете на игралната дъска
    public void render(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(27,35,50,50);
        g.fillOval(125,35,50,50);
        g.fillOval(225,35,50,50);
        g.fillOval(325,35,50,50);

        g.setColor(Color.green);
        g.fillOval(125,425,50,50);
        g.fillOval(225,425,50,50);
        g.fillOval(325,425,50,50);
        g.fillOval(421,425,50,50);

        g.setColor(Color.green);
        g.drawOval(27,35,50,50);
        g.drawOval(125,35,50,50);
        g.drawOval(225,35,50,50);
        g.drawOval(325,35,50,50);

        g.setColor(Color.yellow);
        g.drawOval(125,425,50,50);
        g.drawOval(225,425,50,50);
        g.drawOval(325,425,50,50);
        g.drawOval(421,425,50,50);

    }
}
