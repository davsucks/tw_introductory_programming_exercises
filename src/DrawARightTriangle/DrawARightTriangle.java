package DrawARightTriangle;

/**
 * Created by David on 4/2/2015.
 */
public class DrawARightTriangle {
    public static void main(String[] args) {
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            alertUserToBadInput();
            return;
        }

        if (n < 0) {
            alertUserToBadInput();
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

    private static void alertUserToBadInput() {
        System.out.println("Please enter a positive integer at the command line");
    }
}
