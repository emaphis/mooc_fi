
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;


public class ClickListener implements ActionListener {
    private final Calculator calculatior;
    private final JLabel text;

    public ClickListener(Calculator calculator, JLabel text) {
        this.calculatior = calculator;
        this.text = text;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        calculatior.increase();
        Integer num = calculatior.giveValue();
        text.setText(num.toString());
    }

}
