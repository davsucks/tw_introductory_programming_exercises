package PrimeFactors;
import java.util.ArrayList;

/**
 * Created by David on 4/2/2015.
 */
public class PrimeFactors {
    public static void main(String[] args) {
        ArrayList<Integer> primeFactors = generate(1);
        System.out.println("Should be an empty list:");
        primeFactors.forEach(System.out::println);

        System.out.println("Should be 2, 3, 5");
        primeFactors = generate(30);
        primeFactors.forEach(System.out::println);
    }

    private static ArrayList<Integer> generate(int n) {
        ArrayList<Integer> returnList = new ArrayList<>();
        int copyOfI = n;
        for (int i = 2; i <= copyOfI; i++) {
            while (n % i == 0) {
                returnList.add(i);
                n /= i;
            }
        }
        return returnList;
    }
}
