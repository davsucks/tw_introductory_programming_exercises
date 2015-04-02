package DiamondExercises;
import Helpers.ExercisesHelper;

/**
 * Created by David on 4/2/2015.
 */
public class Diamond {
    public static void main(String[] args) {
        int n = ExercisesHelper.getFirstCommandLineArgAsInt(args);
        if (n < 0) {
            return;
        }

        PrintShapes.printDiamond(n);
    }
}
