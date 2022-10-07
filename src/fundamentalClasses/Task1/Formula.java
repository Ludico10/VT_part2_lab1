package fundamentalClasses.Task1;

import static java.lang.Math.abs;
import static java.lang.Math.sin;

public class Formula {
    public static double calculate(double x, double y) {
        double numerator = 1 + sin(x + y) * sin(x + y);
        double denominator = 2 + abs(x - ((2 * x) / (1 + x * x * y * y)));
        return numerator / denominator + x;
    }
}
