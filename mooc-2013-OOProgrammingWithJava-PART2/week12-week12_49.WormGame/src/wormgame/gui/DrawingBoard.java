
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.game.WormGame;


public class DrawingBoard extends JPanel implements Updatable {
    private WormGame wormgame;
    private int pieceLength;

    public DrawingBoard(WormGame wormgame, int pieceLength) {
        this.wormgame = wormgame;
        this.pieceLength = pieceLength;
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);
        for(Piece piece : wormgame.getWorm().getPieces()) {
            g.draw3DRect(pieceLength * piece.getX(), pieceLength * piece.getY(), pieceLength, pieceLength, true);
        }

        Apple apple = wormgame.getApple();
        g.setColor(Color.RED);
        g.fillOval(pieceLength * apple.getX(), pieceLength * apple.getY(), pieceLength, pieceLength);
    }

    @Override
    public void update() {
        repaint();
    }

}
