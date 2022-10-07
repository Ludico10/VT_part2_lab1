package fundamentalClasses.Task8;

import java.util.ArrayList;
import java.util.List;

public class Increase {
    public static List<Integer> positions(double[] source, double[] added){
        if (source == null || added == null)
            throw new NullPointerException("source or added is null");

        List<Integer> result= new ArrayList<>();
        for (double v : added) {
            boolean found = false;
            for (int j = 0; (j < source.length) && !found; j++) {
                if (v < source[j]) {
                    result.add(j);
                    found = true;
                }
            }
            if (!found)
                result.add(source.length);
        }
        return result;
    }
}
