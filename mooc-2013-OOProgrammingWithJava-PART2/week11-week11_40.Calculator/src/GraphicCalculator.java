
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        frame.setLayout(layout);

        JTextField output = new JTextField("0");
        output.setEnabled(false);
        JTextField entry = new JTextField();
 
        container.add(output);
        container.add(entry);
        container.add(createPanel(entry, output), BorderLayout.SOUTH);
    }

    private JPanel createPanel(JTextField entry, JTextField output) {
        JPanel panel = new JPanel(new GridLayout(1, 3));

        JButton addBtn = new JButton("+");
        JButton subBtn = new JButton("-");
        JButton zeroBtn = new JButton("Z");

        CalcListener listener = new CalcListener(addBtn, subBtn, zeroBtn, entry, output);

        addBtn.addActionListener(listener);
        subBtn.addActionListener(listener);
        zeroBtn.addActionListener(listener);

        zeroBtn.setEnabled(false);
 
        panel.add(addBtn);
        panel.add(subBtn);
        panel.add(zeroBtn);

        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }

}
