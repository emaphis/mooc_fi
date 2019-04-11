
package userinterface;

import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {
        //UserInterface ui = new UserInterface();
        ButtonWindow ui = new ButtonWindow();
        SwingUtilities.invokeLater(ui);
    }

}
