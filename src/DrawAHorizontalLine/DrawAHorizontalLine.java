package DrawAHorizontalLine;
import Helpers.ExercisesHelper;

/**
 * Created by David on 4/1/2015.
 */
public class DrawAHorizontalLine {
    public static void main(String[] args) {
        int n = ExercisesHelper.getFirstCommandLineArgAsInt(args);
        if (n < 0) {
            return;
        }

        String output = "";
        for (int i = 0; i < n; ++i) {
            output += "*";
        }
        System.out.println(output);
    }
}
