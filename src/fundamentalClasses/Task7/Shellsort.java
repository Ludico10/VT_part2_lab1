package fundamentalClasses.Task7;

public class Shellsort {
    public static void sort(double[] arr) {
        if (arr==null)
            throw new NullPointerException("arr is null");

        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                double temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i--;
            }
            i++;
        }
    }
}
