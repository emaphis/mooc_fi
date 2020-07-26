package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AsteroidsApplication extends Application {

    public static int WIDTH = 300;
    public static int HEIGHT = 200;

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);

        Character ship = new Ship(WIDTH / 2, HEIGHT / 2);

        List<Asteriod> asteroids = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            Asteriod asteriod = new Asteriod(rnd.nextInt(WIDTH / 3), rnd.nextInt(HEIGHT));
            asteroids.add(asteriod);
        }

        pane.getChildren().add(ship.getCharacter());
        asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getCharacter()));

        List<Projectile> projectiles = new ArrayList<>();

        Scene scene = new Scene(pane);

        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();

        scene.setOnKeyPressed(event -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });

        scene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });

        new AnimationTimer() {

            @Override
            public void handle(long now) {
                if (pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
                    ship.turnLeft();
                }

                if (pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
                    ship.turnRight();
                }

                if (pressedKeys.getOrDefault(KeyCode.UP, false)) {
                    ship.accelerate();
                }

                if (pressedKeys.getOrDefault(KeyCode.SPACE, false) && projectiles.size() < 3) {
                    // shoot
                    Projectile projectile = new Projectile((int) ship.getCharacter().getTranslateX(), (int) ship.getCharacter().getTranslateY());
                    projectile.getCharacter().setRotate(ship.getCharacter().getRotate());
                    projectiles.add(projectile);

                    projectile.accelerate();
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));

                    pane.getChildren().add(projectile.getCharacter());
                }

                ship.move();
                asteroids.forEach(asteroid -> asteroid.move());
                projectiles.forEach(projectile -> projectile.move());

                projectiles.forEach(projectile -> {
                    List<Asteriod> collisions = asteroids.stream()
                                    .filter(asteriod -> asteriod.collide(projectile))
                                    .collect(Collectors.toList());
                    collisions.stream().forEach(collided -> {
                        asteroids.remove(collided);
                        pane.getChildren().remove(collided.getCharacter());
                    });
                });

                asteroids.forEach(asteroid -> {
                    if (ship.collide(asteroid)) {
                        stop();
                    }
                });

            }
        }.start();

        stage.setTitle("Asteroids 1233!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(AsteroidsApplication.class);
        System.out.println("Hello, world!");
    }

    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 0;
    }

}
