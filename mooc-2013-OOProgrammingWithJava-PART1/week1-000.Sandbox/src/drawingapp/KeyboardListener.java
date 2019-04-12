
package drawingapp;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyboardListener implements KeyListener {

    private final Component component;
    private final Avatar avatar;

    public KeyboardListener(Avatar avatar, Component component) {
        this.avatar = avatar;
        this.component = component;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("event: " + e);
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
          //  System.out.println("left");
            avatar.move(-5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
          //  System.out.println("right");
            avatar.move(5, 0);
        }

        component.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
       //System.out.println("Keystroke " + e.getKeyCode() + " pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) { }

}
