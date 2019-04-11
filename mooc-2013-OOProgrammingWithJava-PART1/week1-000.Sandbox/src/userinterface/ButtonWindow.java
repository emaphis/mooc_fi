
package userinterface;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;


public class ButtonWindow implements Runnable {
    private JFrame frame;

    public ButtonWindow() {
    }

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(200, 100));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void testBorderLayout(Container container) {
        container.setLayout(new BorderLayout());

        container.add(new JButton("North"), BorderLayout.NORTH);
        container.add(new JButton("East"), BorderLayout.EAST);
        container.add(new JButton("South"), BorderLayout.SOUTH);
        container.add(new JButton("West"), BorderLayout.WEST);
        container.add(new JButton("Center"), BorderLayout.CENTER);

        container.add(new JButton("Default (Center)"));
    }

    private void testBoxLayout(Container container) {
        ///BoxLayout layout = new BoxLayout(container, BoxLayout.X_AXIS);
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("First!"));
        container.add(new JLabel("Second!"));
        container.add(new JLabel("Third!"));
    }

    private void testBoxLayout2(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Choose meat or fish:"));

        JRadioButton meat = new JRadioButton("Meat");
        JRadioButton fish = new JRadioButton("Fish");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(meat);
        buttonGroup.add(fish);

        container.add(meat);
        container.add(fish);
    }



    private void createComponents(Container container) {
        //testBorderLayout(container);
        //testBoxLayout(container);
        testBoxLayout2(container);
    }

    public JFrame getFrame() {
        return frame;
    }

}
