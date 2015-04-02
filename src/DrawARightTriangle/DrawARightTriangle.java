package DrawARightTriangle;
import Helpers.ExercisesHelper;

/**
 * Created by David on 4/2/2015.
 */
public class DrawARightTriangle {
    public static void main(String[] args) {
        int n = ExercisesHelper.getFirstCommandLineArgAsInt(args);
        if (n < 0) {
            return;
        }

        String output = "";
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                output += "*";
            }
            output += "\n";
        }
        System.out.println(output);
    }
}
