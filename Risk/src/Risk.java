import java.util.Arrays;
import java.util.Collections;

public class Risk {
    static Integer[] red = {0,0,0};
    static Integer[] white = {0,0};
    static int redWin;
    static int whiteWin;
    static int tie;
    static int totalNumberOfOutcomes;

    public static void main(String[] args){
        redWin = 0;
        whiteWin = 0;
        tie = 0;
        totalNumberOfOutcomes = 0;


        for (int r1=1; r1 <= 6; r1++){
            for (int r2=1; r2 <= 6; r2++){
                for (int r3=1; r3 <= 6; r3++){
                    for (int w1=1; w1 <= 6; w1++){
                        for (int w2=1; w2 <= 6; w2++){
                            red[0] = r1;
                            red[1] = r2;
                            red[2] = r3;
                            white[0] = w1;
                            white[1] = w2;
                            Arrays.sort(red, Collections.reverseOrder());
                            Arrays.sort(white, Collections.reverseOrder());
                            if (white[0] < red [0]) {    //red wins first pair
                                if (white[1] < red[1]) { //red wins second pair
                                    redWin++;
                                } else { //red and white both win 1
                                    tie++;
                                }
                            } else if (white[0] >= red[0]) { //white wins first pair
                                if (white[1] < red[1]) { //red wins second pair
                                    tie++;
                                } else { // white wins second pair
                                    whiteWin++;
                                }
                            }
                            totalNumberOfOutcomes++;
                        }
                    }
                }
            }
        }

        double wins;
        double outcomes;
        double percent;

        outcomes = totalNumberOfOutcomes;

        System.out.print("Red Wins: " + redWin + " ... ");
        wins = redWin;
        percent = (wins/outcomes) * 100;
        System.out.println(percent + "%");

        System.out.print("White Wins: "+ whiteWin + " ... ");
        wins = whiteWin;
        percent = (wins/outcomes) * 100;
        System.out.println(percent + "%");

        System.out.print("Ties: " + tie + " ... ");
        wins = tie;
        percent = (wins/outcomes) * 100;
        System.out.println(percent + "%");

        int totalCalculatedOutcomes = redWin + whiteWin + tie;
        System.out.println("Total Calculated Outcomes: " + totalCalculatedOutcomes);

        System.out.println("Total Number of Outcomes: " + totalNumberOfOutcomes);
    }
}
