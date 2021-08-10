import java.util.Random;

public class Unit1Q2Sim {
    public static void main(String[] args) {

        int trials = 90000, green = 0, yellow = 0, red = 0;

        for (int i = 1; i <= trials; i++) {
            // Throw a die
            int die = new Random().nextInt(6) + 1;

            // If 1 or 2, draw from bag A,
            if (die == 1 || die == 2) {
                int marble = new Random().nextInt(6) + 1;
                if (marble == 1) {
                    // we get a green.
                    green++;
                } else if (marble == 2 || marble == 3) {
                    // we get a yellow;
                    yellow++;
                } else if (marble == 4 || marble == 5 || marble == 6) {
                    red++;// we get a red;
                }
                // or draw from bag B
            } else {
                int marble = new Random().nextInt(5) + 1;
                if (marble == 1 || marble == 2 || marble == 3) {
                    // we get a green.
                    green++;
                } else if (marble == 4 || marble == 5) {
                    // we get a red;
                    red++;
                }
            }
        }
        System.out.println("Number of trials: " + trials + ", Times getting green marble: " + green + ", probability: " + (green * 1.0 / trials));    }
}
