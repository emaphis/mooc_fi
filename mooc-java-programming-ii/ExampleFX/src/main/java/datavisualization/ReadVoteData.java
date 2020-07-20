
package datavisualization;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class ReadVoteData {

    public static void main(String[] args) {
        var values = readVoterFile("votedata1.txt");
        System.out.println("values= " + values);
    }

    private static HashMap<String, HashMap<Integer, Double>> readVoterFile(String filename) {
        var values = new HashMap<String, HashMap<Integer, Double>>();
        var yearList = new ArrayList<Integer>();

        try(Scanner data = new Scanner(Paths.get(filename))) {
            String row = data.nextLine();
            String[] stringArr = row.split("\t");
            for (int i = 1; i < stringArr.length; i++) { // skip first
                yearList.add(Integer.parseInt(stringArr[i]));
            }

            while (data.hasNext()) {
                String next = data.nextLine();
                stringArr = next.split("\t");
                String party = stringArr[0];
                HashMap<Integer, Double> map = new HashMap<>();
                for (int i = 1; i < stringArr.length; i++) {
                    if (!stringArr[i].equals("-")) {
                        int year = yearList.get(i-1);
                        String dat = stringArr[i];
                        double number = Double.parseDouble(dat);
                        map.put(year, number);
                    }

                }
                values.put(party, map);
            }

            //System.out.println("values= " + values);
        } catch(Exception e) {
            System.err.println("Error: " + e.toString());
        }

        return values;
    }

}
