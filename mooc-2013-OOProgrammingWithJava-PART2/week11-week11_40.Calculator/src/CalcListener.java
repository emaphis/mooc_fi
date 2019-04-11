
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class CalcListener implements ActionListener {
    private final JButton addBtn;
    private final JButton subBtn;
    private final JButton zeroBtn;
    private final JTextField entry;
    private final JTextField output;
    private final CalcImplementation impl;

    public CalcListener(JButton addBtn, JButton subBtn, JButton zeroBtn,
                        JTextField entry, JTextField output) {
        this.addBtn = addBtn;
        this.subBtn = subBtn;
        this.zeroBtn = zeroBtn;
        this.entry = entry;
        this.output = output;
        this.impl = new CalcImplementation();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String txt = entry.getText();
        int num;

        try {
            num = Integer.parseInt(txt);
        } catch(NumberFormatException ex) {
            num = 0;
        }

        if (ae.getSource() == addBtn) {
            impl.add(num);
        } else if (ae.getSource() == subBtn) {
            impl.sub(num);
        } else {   // ae.getSource() == zeroBtn
            impl.reset();
        }

        entry.setText("");
        output.setText(impl.getValue().toString());

        if (impl.getValue() == 0) {
            zeroBtn.setEnabled(false);
        } else {
            zeroBtn.setEnabled(true);
        }
    }

}
