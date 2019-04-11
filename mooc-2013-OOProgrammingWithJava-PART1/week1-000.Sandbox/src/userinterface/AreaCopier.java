
package userinterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;


public class AreaCopier implements ActionListener {

    private JTextArea origin;
    private JTextArea destinition;

    public AreaCopier(JTextArea origin, JTextArea destinition) {
        this.origin = origin;
        this.destinition = destinition;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        destinition.setText(origin.getText());
    }

}
