
package personapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


public class PersonRecordListener implements ActionListener {
    private PersonRecord personRecord;
    private JTextField nameField;
    private JTextField idField;

    public PersonRecordListener(PersonRecord personRecord, JTextField nameField, JTextField idField) {
        this.personRecord = personRecord;
        this.nameField = nameField;
        this.idField = idField;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Person person = new Person(nameField.getText(), idField.getText());
        this.personRecord.recored(person);
    }
    
}
