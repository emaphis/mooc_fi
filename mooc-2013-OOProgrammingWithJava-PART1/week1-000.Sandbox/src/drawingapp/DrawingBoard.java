
package drawingapp;

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

        graphics.setColor(Color.GREEN);
        graphics.fillRect(50, 80, 100, 50);
        graphics.setColor(Color.BLACK);
        graphics.fillRect(200, 20, 50, 200);
    }

}
