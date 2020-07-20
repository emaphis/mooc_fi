
package datavisualization;

import java.util.Scanner;
import java.nio.file.Paths;

/**
 * Open a text file and print out it's elements
 * @author emaphis
 */
public class ReadData1 {

    public static void main(String[] args) {
        try(Scanner data = new Scanner(Paths.get("data1.txt"))) {
            String row = "";
            while (data.hasNext()) {
                String next = data.nextLine();
                row += next;
            }

            String[] pieces = row.split(";");
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(i + ": " + pieces[i]);
            }

        } catch(Exception e) {
            System.err.println("Error: " + e.toString());
        }

    }

}
