
package personapp;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;


public class PersonAppUI implements Runnable {
    private JFrame frame;
    private PersonRecord personRecord;

    public PersonAppUI(PersonRecord personRecord) {
        this.personRecord = personRecord;
    }

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
        GridLayout layout = new GridLayout(3, 2);
        container.setLayout(layout);

        JLabel textName = new JLabel("Name: ");
        JTextField nameField = new JTextField();
        JLabel textID = new JLabel("ID:");
        JTextField idField = new JTextField();

        JButton addButton = new JButton("Add!");
        PersonRecordListener listener = new PersonRecordListener(personRecord, nameField, idField);
        addButton.addActionListener(listener);

        container.add(textName);
        container.add(nameField);
        container.add(textID);
        container.add(idField);
        container.add(new JLabel(""));
        container.add(addButton);
    }

    public JFrame getFrame() {
        return frame;
    }

}
