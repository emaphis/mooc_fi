
package userinterface;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;


public class ActionObjects implements Runnable {
    private JFrame frame;

    public ActionObjects() { }

    @Override
    public void run() {
        frame = new JFrame("The Copier");
        frame.setPreferredSize(new Dimension(300, 100));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(1, 3);
        container.setLayout(layout);

        JTextArea textAreaLeft = new JTextArea("The Copier");
        JTextArea textAreaRight = new JTextArea();
        JButton copyButton = new JButton("Copy!");

        AreaCopier copier = new AreaCopier(textAreaLeft, textAreaRight);
        copyButton.addActionListener(copier);

        container.add(textAreaLeft);
        container.add(copyButton);
        container.add(textAreaRight);
    }

    public JFrame getFrame() {
        return frame;
    }

}
