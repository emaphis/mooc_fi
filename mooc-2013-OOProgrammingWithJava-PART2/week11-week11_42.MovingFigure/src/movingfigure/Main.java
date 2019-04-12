package movingfigure;

import javax.swing.SwingUtilities;

public class Main {

    private static CompoundFigure createCompoundFigure() {
        CompoundFigure truck = new CompoundFigure();

        truck.add(new Box(220, 110, 75, 100));
        truck.add(new Box(80, 120, 200, 100));
        truck.add(new Circle(100, 200, 50));
        truck.add(new Circle(220, 200, 50));

        return truck;
    }


    public static void main(String[] args) {
        // test your program here
        Figure figure;
        //figure = new Circle(50, 50, 250);
        //figure = new Square(50, 50, 250);
        //figure = new Box(50, 50, 100, 300);
        figure = createCompoundFigure();
        UserInterface ui = new UserInterface(figure);
        SwingUtilities.invokeLater(ui);
    }
}
