
package personapp;

import java.util.Collection;
import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {
        PersonDb recordDb = new PersonDb();
        PersonAppUI ui = new PersonAppUI(recordDb);
        SwingUtilities.invokeLater(ui);
    }

}
