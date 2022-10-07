package fundamentalClasses.Task5;

public class TableIncreaseCleaner {
    private static int CeilIndex(int[] arr, int right, int key)
    {
        int left = -1;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= key)
                right = mid;
            else
                left = mid;
        }
        return right;
    }

    public static int longest(int[] arr, int size)
    {
        if (arr==null)
            throw new NullPointerException("arr is null");
        if (size == 1)
            return 1;

        int[] tailTable = new int[size];
        int len = 1;

        tailTable[0] = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < tailTable[0])
                tailTable[0] = arr[i];
            else if (arr[i] > tailTable[len - 1])
                tailTable[len++] = arr[i];
            else
                tailTable[CeilIndex(tailTable, len - 1, arr[i])] = arr[i];
        }
        return len;
    }
}
