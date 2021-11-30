package GT;

public class Search {
    public static int sequentialSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a, int x, int left, int right) {
        int middle = left + (right - left) / 2;
        if (right < left)
            return -1;
        if (a[middle] == x)
            return middle;
        else if (x < a[middle])
            return binarySearch(a, x, left, middle - 1);
        return binarySearch(a, x, middle + 1, right);
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6};
        int r = binarySearch(a, 6, 0, a.length - 1);
        System.out.println(r);
    }
}
