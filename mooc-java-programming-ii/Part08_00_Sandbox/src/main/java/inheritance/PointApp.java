/*
 * Week 9 Exercise
 */
package inheritance;

import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class PointApp {
    public static void main(String[] args) {
        example1();
        System.out.println("oooooo");
        example2();
    }

    static void example1() {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4, 8));
        points.add(new ColorPoint(1, 1, "green"));
        points.add(new ColorPoint(2, 5, "blue"));
        points.add(new Point(0, 0));

        for (Point point : points) {
            System.out.println(point);
        }
    }

    static void example2() {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4, 8));
        points.add(new ColorPoint(1, 1, "green"));
        points.add(new ColorPoint(2, 5, "blue"));
        points.add(new Point3D(5, 2, 8));
        points.add(new Point(0, 0));

        for (Point point : points) {
            System.out.println(point);
        }

    }

}
