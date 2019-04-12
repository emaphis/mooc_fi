
package drawingapp;

import javax.swing.SwingUtilities;


public class Main {

    public static void main(String[] args) {
        DrawingUI ui = new DrawingUI();
        SwingUtilities.invokeLater(ui);
    }

}
