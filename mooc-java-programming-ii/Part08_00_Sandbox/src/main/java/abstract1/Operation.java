/*
 * Week 9 example
 */
package abstract1;

import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public abstract class Operation {
    private String name;

    public Operation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void execute(Scanner scanner);
}
