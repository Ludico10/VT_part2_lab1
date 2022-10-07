package fundamentalClasses.Task3;

import java.util.LinkedHashMap;
import java.util.Map;

public class TgRange {
    public static Map<Double, Double> createTable(double a, double b, double h) {
        if (a > b)
            throw new IllegalArgumentException("parameter a is greater than b");
        if (h <= 0)
            throw new IllegalArgumentException("parameter h is less than 0");
        Map<Double, Double> result = new LinkedHashMap<>();
        for (var i = a; i <= b; i += h) {
            result.put(i, Math.tan(i));
        }
        result.put(b, Math.tan(b));
        return result;
    }
}
