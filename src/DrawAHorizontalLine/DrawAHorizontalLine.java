package DrawAHorizontalLine;

/**
 * Created by David on 4/1/2015.
 */
public class DrawAHorizontalLine {
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
        for (int i = 0; i < n; ++i) {
            output += "*";
        }
        System.out.println(output);
    }

    private static void alertUserToBadInput() {
        System.out.println("Please enter a positive integer at the command line");
    }
}
