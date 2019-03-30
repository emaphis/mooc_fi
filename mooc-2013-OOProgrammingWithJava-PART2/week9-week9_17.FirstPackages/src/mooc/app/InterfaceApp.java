
package mooc.app;

import mooc.logic.ApplicationLogic;
import mooc.ui.TextUserInterface;
import mooc.ui.UserInterface;


public class InterfaceApp {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }

}
