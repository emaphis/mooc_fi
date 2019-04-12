
package drawingapp;

import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {
        Avatar avatar = new Avatar(30, 30);
        DrawingUI ui = new DrawingUI(avatar);
        SwingUtilities.invokeLater(ui);
    }

}
