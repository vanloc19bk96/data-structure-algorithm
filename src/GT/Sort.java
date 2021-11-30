package GT;

public class Sort {
    public static void bubbleSort(int[] a) {
        int n = a.length;
        boolean isSorted = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
            for (int j : a) {
                System.out.printf("%d ", j);
            }
            System.out.println();
            if (isSorted)
                break;
        }
    }

    public static void insertSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int ai = a[i];
            int j = i - 1;
            while (j >= 0 && ai < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
        }
        for (int j : a) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i + 1;
            for (int j = i + 1; j < n; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            if (a[minIndex] < a[i]) {
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
        }

        for (int j : a) {
            System.out.printf("%d ", j);
        }
        System.out.println();

    }

    public static void main(String[] args) {
//        int[] a = {2, 3, 5, 1};
        int[] a = {1, 2, 3, 4, 5, 7, 6};
        selectionSort(a);
    }
}
