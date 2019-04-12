
package drawingapp;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class DrawingUI implements Runnable {
    private JFrame frame;
    private DrawingBoard board;
    private Avatar avatar;

    public DrawingUI(Avatar avatar) {
        this.avatar = avatar;
    }

    @Override
    public void run() {
        frame = new JFrame("Drawing Board");
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addlisteners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        board = new DrawingBoard(avatar);
        container.add(board);
    }

    private void addlisteners() {
        frame.addKeyListener(new KeyboardListener(avatar, board));
    }

    public JFrame getFrame() {
        return frame;
    }

}
