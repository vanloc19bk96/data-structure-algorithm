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

    public static int ternarySearch(int[] a, int x, int left, int right) {
        int partion = (right - left) / 3;
        int middle1 = left + partion;
        int middle2 = middle1 + partion;
        if(right < left)
            return -1;
        if (x == a[middle1])
            return middle1;
        if (x == a[middle2])
            return middle2;
        if (x < a[middle1])
            return ternarySearch(a, x, left, middle1 - 1);
        else if (x > a[middle1] && x < a[middle2])
            return ternarySearch(a, x, middle1 + 1, middle2 - 1);
        else
            return ternarySearch(a, x, middle2 + 1, right);
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6};
        int r = ternarySearch(a, 7, 0, a.length - 1);
        System.out.println(r);
    }
}
