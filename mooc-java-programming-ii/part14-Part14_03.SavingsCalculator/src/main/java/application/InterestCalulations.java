
package application;

import java.util.Map;
import java.util.HashMap;


public class InterestCalulations {

    public Map<Integer, Double> calculateSavings(int years, double savings) {
        Map<Integer, Double> savingsMap = new HashMap<>();
        double current = 0;

        for (int i = 0; i < years; i++) {
            savingsMap.put(i, current);
            current += savings * 12;
        }

        return savingsMap;
    }

    public Map<Integer, Double> calculateInterest(int years, double savings, double rate) {
        Map<Integer, Double> interestMap = new HashMap<>();
        double current = 0;

        for (int i = 0; i < years; i++) {
            interestMap.put(i, current);
            current += savings * 12;
        }

        return interestMap;
    }

}
