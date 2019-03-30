
package mooc.ui;

import mooc.ui.UserInterface;


public class TextUserInterface implements UserInterface {

    @Override
    public void update() {
        System.out.println("Updating the user interface");
    }
    
}
