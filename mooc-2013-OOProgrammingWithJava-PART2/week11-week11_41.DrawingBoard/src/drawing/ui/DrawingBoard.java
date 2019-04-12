package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        // eyes
        graphics.fillRect(100, 50, 50, 50);
        graphics.fillRect(250, 50, 50, 50);

        // cheek bones
        graphics.fillRect(50, 200, 50, 50);
        graphics.fillRect(300, 200, 50, 50);

        // mouth
        graphics.fillRect(100, 250, 200, 50);
    }
}
