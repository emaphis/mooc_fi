
package asteroids;

import java.util.Random;

public class Asteriod extends Character {

    private double rotationalMovement;

    public Asteriod(int x, int y) {
        super(new PolygonFactory().createPolygon(), x, y);

        Random rnd = new Random();

        int accelerationAmount = 1 + rnd.nextInt(10);
        for (int i = 0; i < accelerationAmount; i++) {
            accelerate();
        }

        rotationalMovement = 0.5 - rnd.nextDouble();
    }

    @Override
    public void move() {
        super.move();
        super.getCharacter().setRotate(super.getCharacter().getRotate() + rotationalMovement);
    }

}
