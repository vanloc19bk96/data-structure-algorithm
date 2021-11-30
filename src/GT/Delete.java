package GT;

public class Delete {
    public static void delete(int[] a, int index) {
        int[] newArray = new int[a.length - 1];

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(i == index)
                continue;
            newArray[count] = a[i];
            count++;
        }

        for (int j : newArray) {
            System.out.printf("%d ", j);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3};
        delete(a, 0);
    }
}
