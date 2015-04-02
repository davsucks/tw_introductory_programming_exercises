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
        for (int numSpaces = n - 1, numAsterisks = 1;
             numSpaces >= 0;
             numSpaces -= 1, numAsterisks += 2) {
            for (int i = 0; i < numSpaces; ++i) {
                output += " ";
            }
            for (int j = 0; j < numAsterisks; ++j) {
                output += "*";
            }
            output += "\n";
        }

        System.out.println(output);
    }
}
