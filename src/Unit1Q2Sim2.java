import java.util.Random;

public class Unit1Q2Sim2 {
    public static void main(String[] args) throws Exception {

        // Randomly generated a number from 1 to 6
        int trials = 900000, green = 0, yellow = 0, red = 0;

        char[] bagA = {'G', 'Y', 'Y', 'R', 'R', 'R'};
        char[] bagB = {'G', 'G', 'G', 'R', 'R'};

        for (int i = 1; i <= trials; i++){

            // throw a die
            int die = new Random().nextInt(6) + 1;

            // If 1 or 2, draw from bag A,
            char marble = '0';
            if (die == 1 || die == 2) {
                int draw = new Random().nextInt(6);
                marble = bagA[draw];
                // or draw from bag B
            } else if (die == 3 || die == 4 || die == 5 || die == 6){
                int draw = new Random().nextInt(5);
                marble = bagB[draw];
            }
            // check what colour of marble we got
            if (marble == 'G') {
                // we get a green.
                green++;
            } else if (marble == 'Y') {
                // we get a yellow;
                yellow++;
            } else if (marble == 'R') {
                // we get a red;
                red++;
            }
        }

        System.out.println("Number of trials: " + trials + ", Times getting green marble: " + green + ", probability: " + (green * 1.0 / trials));





    }
}
