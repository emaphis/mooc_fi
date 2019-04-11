
package userinterface;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.WindowConstants;


public class ActionButton implements Runnable {
    private JFrame frame;

    public ActionButton() { }

    @Override
    public void run() {
        frame = new JFrame("Action Button");
        frame.setPreferredSize(new Dimension(200, 100));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    
    private void createComponents(Container container) {
        JButton button = new JButton("Send!");
        button.addActionListener(new MessageListener());

        container.add(button);
    }

    public JFrame getFrame() {
        return frame;
    }

}
