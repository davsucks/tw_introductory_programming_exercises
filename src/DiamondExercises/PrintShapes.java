package DiamondExercises;

/**
 * Created by David on 4/2/2015.
 */
public class PrintShapes {
    public static void printIsoscelesTriangle(int n) {
        String output = buildTopOfDiamond(n);

        System.out.println(output);
    }

    private static String buildTopOfDiamond(int n) {
        String output = "";
        for (int numSpaces = n - 1, numAsterisks = 1;
             numSpaces >= 0;
             numSpaces -= 1, numAsterisks += 2) {
            output = addNSpacesToOutput(output, numSpaces);
            output = addNAsterisksToOutput(output, numAsterisks);
            output += "\n";
        }
        return output;
    }

    public static void printDiamond(int n) {
        String output = buildTopOfDiamond(n);
        output = buildBottomOfDiamond(n, output);
        System.out.println(output);
    }

    private static String buildBottomOfDiamond(int n, String output) {
        for (int numSpaces = 1, numAsterisks = ((n - 1) * 2) - 1;
             numSpaces < n;
             numSpaces += 1, numAsterisks -= 2) {
            output = addNSpacesToOutput(output, numSpaces);
            output = addNAsterisksToOutput(output, numAsterisks);
            output += "\n";
        }
        return output;
    }

    private static String addNAsterisksToOutput(String output, int numAsterisks) {
        for (int j = 0; j < numAsterisks; ++j) {
            output += "*";
        }
        return output;
    }

    private static String addNSpacesToOutput(String output, int numSpaces) {
        for (int i = 0; i < numSpaces; ++i) {
            output += " ";
        }
        return output;
    }
}
