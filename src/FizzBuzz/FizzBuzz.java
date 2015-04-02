package FizzBuzz;

/**
 * Created by David on 4/2/2015.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        String output = "";
        for (int i = 1; i <= 100; ++i, output += "\n") {
            if (i % 3 == 0 && i % 5 == 0) {
                output += "FizzBuzz";
            } else if (i % 3 == 0) {
                output += "Fizz";
            } else if (i % 5 == 0) {
                output += "Buzz";
            } else {
                output += i;
            }
        }

        System.out.println(output);
    }
}
