package DiamondExercises;
import Helpers.ExercisesHelper;

/**
 * Created by David on 4/2/2015.
 */
public class IsoscelesTriangle {
    public static void main(String[] args) {
        int n = ExercisesHelper.getFirstCommandLineArgAsInt(args);
        if (n < 0) {
            return;
        }

        String output = "";
        for (int spaces = n - 1, asteriks = 1;
             spaces >= 0;
             spaces -= 1, asteriks += 2) {
            for (int i = 0; i < spaces; ++i) {
                output += " ";
            }
            for (int j = 0; j < asteriks; ++j) {
                output += "*";
            }
            output += "\n";
        }

        System.out.println(output);
    }
}
