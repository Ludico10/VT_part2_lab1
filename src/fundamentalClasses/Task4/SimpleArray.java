package fundamentalClasses.Task4;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.sqrt;

public class SimpleArray {
    public static List<Integer> PrimesSearch(int[] arr) {
        if (arr==null)
            throw new NullPointerException("arr is null");
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]))
                result.add(i);
        }
        return result;
    }

    private static boolean isPrime(int number) {
        if (number < 2)
            return false;
        int limit = (int) sqrt(number);
        for (int i = 2; i <= limit; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
