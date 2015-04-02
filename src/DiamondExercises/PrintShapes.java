package DiamondExercises;

/**
 * Created by David on 4/2/2015.
 */
public class PrintShapes {
    public static void printIsoscelesTriangle(int n) {
        String output = buildIsoscelesTriangle(n);

        System.out.println(output);
    }

    private static String buildIsoscelesTriangle(int n) {
        String output = "";
        for (int numSpaces = n - 1, numAsterisks = 1;
             numSpaces >= 0;
             numSpaces -= 1, numAsterisks += 2) {
            output = addNSpacesToOutput(output, numSpaces);
            for (int j = 0; j < numAsterisks; ++j) {
                output += "*";
            }
            output += "\n";
        }
        return output;
    }

    public static void printDiamond(int n) {
        String output = buildIsoscelesTriangle(n);

        for (int numSpaces = 1, numAsterisks = ((n - 1) * 2) - 1;
             numSpaces < n;
             numSpaces += 1, numAsterisks -= 2) {
            output = addNSpacesToOutput(output, numSpaces);
            for (int j = 0; j < numAsterisks; ++j) {
                output += "*";
            }
            output += "\n";
        }
        System.out.println(output);
    }

    private static String addNSpacesToOutput(String output, int numSpaces) {
        for (int i = 0; i < numSpaces; ++i) {
            output += " ";
        }
        return output;
    }
}
