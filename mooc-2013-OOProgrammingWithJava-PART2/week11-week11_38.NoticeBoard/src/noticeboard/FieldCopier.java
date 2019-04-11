
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class FieldCopier implements ActionListener {
    private JTextField textField;
    private JLabel label;

    FieldCopier(JTextField textField, JLabel label) {
        this.textField = textField;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String text = textField.getText();
        textField.setText("");
        label.setText(text);
    }

}
