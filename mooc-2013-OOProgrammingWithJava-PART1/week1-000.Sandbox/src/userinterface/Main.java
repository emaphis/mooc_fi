
package userinterface;

import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {
        //UserInterface ui = new UserInterface();
        //ButtonWindow ui = new ButtonWindow();
        //ActionButton ui = new ActionButton();
        ActionObjects ui = new ActionObjects();


        SwingUtilities.invokeLater(ui);
    }

}
