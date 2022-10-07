package fundamentalClasses.Task6;

public class Matrix {
    public static double[][] transform(double[] arr) {
        if (arr==null)
            throw new NullPointerException("arr is null");

        int len = arr.length;
        double[][] result = new double[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                result[i][j] = arr[(i + j) % len];
            }
        }
        return result;
    }
}
