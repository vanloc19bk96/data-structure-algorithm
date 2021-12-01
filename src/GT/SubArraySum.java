package GT;

import java.util.ArrayList;

public class SubArraySum {
    public static void main(String[] args) {
        int[] a = {3, 2, -2, 2, 5};
        int cnt = 0;
        int k = 5;
        for (int i = 0; i < a.length; i++) {
            int sum = a[i];
            if (sum == k) {
                cnt++;
            }
            for (int j = i + 1; j < a.length; j++) {
                sum += a[j];
                if (sum == k) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
