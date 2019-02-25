
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Top 10 players based on goals
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        // Top 25 players based on penalties
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        // Statistics for Sidney Crosby
        NHLStatistics.searchByPlayer("Sidney Crosby");
 
        // Statististics for Philadelphia Flyers.
        NHLStatistics.teamStatistics("PHI");

        // Statisticd for players in Anaheim Ducks ordered by points
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
