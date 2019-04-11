package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        // Create your app here
        frame = new JFrame("Servey");
        frame.setPreferredSize(new Dimension(200, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }


    public JFrame getFrame() {
        return frame;
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));

        JCheckBox yes = new JCheckBox("Yes!");
        JCheckBox no = new JCheckBox("No!");

        container.add(yes);
        container.add(no);

        container.add(new JLabel("Why?"));

        JRadioButton noreason = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(noreason);
        buttonGroup2.add(fun);

        container.add(noreason);
        container.add(fun);

        JButton button = new JButton("Done!");
        container.add(button);
    }
}
