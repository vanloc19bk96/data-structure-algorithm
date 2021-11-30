package GT;

import java.util.Arrays;

public class Insert {
    public static void insert(int[] a, int index, int value) {
        int[] newArray = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }

        for(int i = newArray.length - 1; i > index; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[index] = value;

        for (int j : newArray) {
            System.out.printf("%d ", j);
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3};
        insert(a, 3, 100);
    }
}
