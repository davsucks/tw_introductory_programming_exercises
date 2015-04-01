package DrawAHorizontalLine;

/**
 * Created by David on 4/1/2015.
 */
public class DrawAHorizontalLine {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; ++i) {
            System.out.print("*");
        }
        System.out.print("\n ");
    }
}
