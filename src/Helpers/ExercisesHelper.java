package Helpers;

/**
 * Created by David on 4/2/2015.
 */
public class ExercisesHelper {

    public static int getFirstCommandLineArgAsInt(String[] args) {
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            alertUserToBadInput();
            return -1;
        }

        if (n < 0) {
            alertUserToBadInput();
            return -1;
        }
        return n;
    }

    private static void alertUserToBadInput() {
        System.out.println("Please enter a positive integer at the command line");
    }
}
